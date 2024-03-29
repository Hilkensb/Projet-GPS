package gps;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author bramh_000
 */
  
                
                
                
                import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GpsV2
{
    
    public static void main(String[] args) throws Exception
    {
        //String inputFile = "resources/products.xml";
        String inputFile ="C:\\Users\\bramh_000\\Bureau\\test\\Piste_2018-04-14 094348.gpx";
        
        File xmlFile = new File(inputFile);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!

        XPathFactory xfactory = XPathFactory.newInstance();
        XPath xpath = xfactory.newXPath();
        XPathExpression allProductsExpression = xpath.compile("//product/supplier/text()");
        NodeList productNodes = (NodeList) allProductsExpression.evaluate(doc, XPathConstants.NODESET);

        //Save all the products
        List<String> suppliers = new ArrayList<String>();
        for (int i=0; i<productNodes.getLength(); ++i)
        {
            Node productName = productNodes.item(i);

            System.out.println(productName.getTextContent());
            suppliers.add(productName.getTextContent());
        }

        //Now we create the split XMLs

        for (String supplier : suppliers)
        {
            //String xpathQuery = "/products/product[supplier='" + supplier + "']";
            String xpathQuery = "/gpx/trk/trkseg[supplier='" + supplier + "']";
            
            xpath = xfactory.newXPath();
            XPathExpression query = xpath.compile(xpathQuery);
            NodeList productNodesFiltered = (NodeList) query.evaluate(doc, XPathConstants.NODESET);

            System.out.println("Found " + productNodesFiltered.getLength() + 
                               " product(s) for supplier " + supplier);

            //We store the new XML file in supplierName.xml e.g. Sony.xml
            Document suppXml = dBuilder.newDocument();

            //we have to recreate the root node <products>
            //Element root = suppXml.createElement("products"); 
            Element root = suppXml.createElement("trkseg");
            suppXml.appendChild(root);
            for (int i=0; i<productNodesFiltered.getLength(); ++i)
            {
                Node productNode = productNodesFiltered.item(i);

                //we append a product (cloned) to the new file
                Node clonedNode = productNode.cloneNode(true);
                suppXml.adoptNode(clonedNode); //We adopt the orphan :)
                root.appendChild(clonedNode);
            }

            //At the end, we save the file XML on disk
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(suppXml);

            StreamResult result =  new StreamResult(new File("C:\\Users\\bramh_000\\Bureau\\test\\" + supplier.trim() + ".gpx"));
            transformer.transform(source, result);

            System.out.println("Done for " + supplier);
        }
    }

}

