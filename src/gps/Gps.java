/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

/**
 *
 * @author bramh_000
 */
import java.io.BufferedReader;
import java.io.File;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
 
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;




public class Gps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//        try {
//
//            File file = new File("C:\\Users\\bramh_000\\Bureau\\test\\Piste_2018-04-14 094348.gpx");
//
//            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
//                    .newDocumentBuilder();
//
//            Document doc = dBuilder.parse(file);
//
//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//
//            if (doc.hasChildNodes()) {
//
//                NodeList nodeList = doc.getChildNodes();
//
//                for (int count = 0; count < nodeList.getLength(); count++) {
//
//                    Node tempNode = nodeList.item(count);
//
//                    // make sure it's element node.
//                    if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
//
//                        // get node name and value
//                        System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
//                        System.out.println("Node Value =" + tempNode.getTextContent());
//
//                        if (tempNode.hasAttributes()) {
//
//                            // get attributes names and values
//                            NamedNodeMap nodeMap = tempNode.getAttributes();
//
//                            for (int i = 0; i < nodeMap.getLength(); i++) {
//
//                                Node node = nodeMap.item(i);
//                                System.out.println("attr name : " + node.getNodeName());
//                                System.out.println("attr value : " + node.getNodeValue());
//
//                            }
//
//                        }
//
//                        if (tempNode.hasChildNodes()) {
//
//                            // loop again if has child nodes
//                            nodeList = tempNode.getChildNodes();
//
//                        }
//
//                        System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");
//
//                    }
//
//                }
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        
        
        
        
        
        
        
        
        
        
        
        
        
      

//               DocumentBuilderFactory icFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder icBuilder;
//        try {
//            icBuilder = icFactory.newDocumentBuilder();
//            Document doc = icBuilder.newDocument();
//            Element mainRootElement = doc.createElementNS("https://crunchify.com/CrunchifyCreateXMLDOM", "Companies");
//            doc.appendChild(mainRootElement);
// 
//            // append child elements to root element
//            mainRootElement.appendChild(getCompany(doc, "1", "Paypal", "Payment", "1000"));
//            mainRootElement.appendChild(getCompany(doc, "2", "eBay", "Shopping", "2000"));
//            mainRootElement.appendChild(getCompany(doc, "3", "Google", "Search", "3000"));
// 
//            // output DOM XML to console 
//            Transformer transformer = TransformerFactory.newInstance().newTransformer();
//            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
//            DOMSource source = new DOMSource(doc);
//            StreamResult console = new StreamResult(System.out);
//            transformer.transform(source, console);
// 
//            System.out.println("\nXML DOM Created Successfully..");
// 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
// 
//    private static Node getCompany(Document doc, String id, String name, String age, String role) {
//        Element company = doc.createElement("Company");
//        company.setAttribute("id", id);
//        company.appendChild(getCompanyElements(doc, company, "Name", name));
//        company.appendChild(getCompanyElements(doc, company, "Type", age));
//        company.appendChild(getCompanyElements(doc, company, "Employees", role));
//        return company;
//    }
// 
//    // utility method to create text node
//    private static Node getCompanyElements(Document doc, Element element, String name, String value) {
//        Element node = doc.createElement(name);
//        node.appendChild(doc.createTextNode(value));
//        return node;
   






 try {
     
     
     DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//
//		
//		// staff elements
//		Element staff = docN.createElement("Staff");
//		rootElement.appendChild(staff);
//
//		// set attribute to staff element
//		Attr attr = docN.createAttribute("id");
//		attr.setValue("1");
//		staff.setAttributeNode(attr);
//
//		// shorten way
//		// staff.setAttribute("id", "1");
//
//		// firstname elements
//		Element firstname = docN.createElement("firstname");
//		firstname.appendChild(docN.createTextNode("yong"));
//		staff.appendChild(firstname);
//
//		// lastname elements
//		Element lastname = docN.createElement("lastname");
//		lastname.appendChild(docN.createTextNode("mook kim"));
//		staff.appendChild(lastname);
//
//		// nickname elements
//		Element nickname = docN.createElement("nickname");
//		nickname.appendChild(docN.createTextNode("mkyong"));
//		staff.appendChild(nickname);
//
//		// salary elements
//		Element salary = docN.createElement("salary");
//		salary.appendChild(docN.createTextNode("100000"));
//		staff.appendChild(salary);
//

//     
     
     
     

	File fXmlFile = new File("C:\\Users\\bramh_000\\Bureau\\test\\Piste_2018-04-14 094348.gpx");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
			
        
        
	//optional, but recommended
	//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//	 root elements
		Document docN = docBuilder.newDocument();
		Element rootElement = docN.createElement(doc.getDocumentElement().getNodeName());
		docN.appendChild(rootElement);

        Element metadata = docN.createElement("metadata");
	rootElement.appendChild(metadata);
        
        
        NodeList nList = doc.getElementsByTagName("gpx");
			
	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
                        
			
                        for (int i =0;i<eElement.getAttributes().getLength();i++){
                                                    
                            System.out.println("n° "+i +" : " + eElement.getAttributes().item(i).toString());
                            System.out.println("Attribute name "+i +" : " + eElement.getAttributes().item(i).getNodeName());
                            System.out.println("Value "+i +" : " + eElement.getAttributes().item(i).getNodeValue());
                            
//                            
                            Attr attrR = docN.createAttribute(eElement.getAttributes().item(i).getNodeName());
                            attrR.setValue(eElement.getAttributes().item(i).getNodeValue());
                            rootElement.setAttributeNode(attrR);
                        }
			

		}
	}		
        
        
        
        
	 nList = doc.getElementsByTagName("link");
         
         // staff elements
		Element link = docN.createElement("link");
		metadata.appendChild(link);
                
                Element text = docN.createElement("text");

			
	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
                        
			System.out.println("href : " + eElement.getAttribute("href"));
			System.out.println("Text : " + eElement.getElementsByTagName("text").item(0).getTextContent());
                        
                text.appendChild(docN.createTextNode(eElement.getElementsByTagName("text").item(0).getTextContent()));
		link.appendChild(text);
                        
                        Attr attrL = docN.createAttribute("href");
                           attrL.setValue(eElement.getAttribute("href"));
                           link.setAttributeNode(attrL);
                           
                           
                        
		}
	}
        
        nList = doc.getElementsByTagName("metadata");
			
	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
                        
			System.out.println("Time : " + eElement.getElementsByTagName("time").item(0).getTextContent());

		}
	}
        
        
        
        
        
        
        
     		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(docN);
		StreamResult result = new StreamResult(new File("C:\\Users\\bramh_000\\Bureau\\test\\file.gpx"));

		// Output to console for testing
		// StreamResult result = new StreamResult(System.out);

		transformer.transform(source, result);

		System.out.println("File saved!");
       
                
                
         
                
                
                
                
                
              
                
                
                
                
                
                
                
                
                
                
       
          // PrintWriter object for output.txt
        PrintWriter pw = new PrintWriter("C:\\Users\\bramh_000\\Bureau\\test\\NoMetaFile.gpx");
         
        // BufferedReader object for delete.txt
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\bramh_000\\Bureau\\test\\file.gpx"));
         
        String line2 = br2.readLine();
         
        // hashset for storing lines of delete.txt
        HashSet<String> hs = new HashSet<String>();
         
        // loop for each line of delete.txt
        while(line2 != null)
        {
            hs.add(line2);
            line2 = br2.readLine();
        }
                     
        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\bramh_000\\Bureau\\test\\Piste_2018-04-14 094348.gpx"));
         
        String line1 = br1.readLine();
         
        // loop for each line of input.txt
        while(line1 != null)
        {
            // if line is not present in delete.txt
            // write it to output.txt
            if(!hs.contains(line1))
                pw.println(line1);
             
            line1 = br1.readLine();
        }
         
        pw.flush();
         
        // closing resources
        br1.close();
        br2.close();
        pw.close();
         
        System.out.println("File operation performed successfully");
                
        
       
        
                
              
                
        
    } catch (Exception e) {
	e.printStackTrace(); 
    }













 
 
 

//        try {
//
//            File file = new File("C:\\Users\\bramh_000\\Bureau\\test\\Piste_2018-04-14 094348.gpx");
//
//            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
//                    .newDocumentBuilder();
//
//            Document doc = dBuilder.parse(file);
//
//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//            System.out.println("Root element :" + doc.getDocumentElement().getTextContent());
////             DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
////       DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
////       Document docNew = docBuilder.newDocument();
////          
////        // Create Person root element 
////        Element personRootElement = docNew.createElement(doc.getDocumentElement().getNodeName());
////        docNew.appendChild(personRootElement);
////            
//        
//            if (doc.hasChildNodes()) {
//
//                NodeList nodeList = doc.getChildNodes();
//
//                for (int count = 0; count < nodeList.getLength(); count++) {
//
//                    Node tempNode = nodeList.item(count);
//
//                    // make sure it's element node.
//                    if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
//
//                        // get node name and value
//                        System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
//                        System.out.println("Node Value =" + tempNode.getTextContent());
//
//                        if (tempNode.hasAttributes()) {
//
//                            // get attributes names and values
//                            NamedNodeMap nodeMap = tempNode.getAttributes();
//
//                            for (int i = 0; i < nodeMap.getLength(); i++) {
//
//                                Node node = nodeMap.item(i);
//                                System.out.println("attr name : " + node.getNodeName());
//                                System.out.println("attr value : " + node.getNodeValue());
//
//                            }
//
//                        }
//
//                        if (tempNode.hasChildNodes()) {
//
//                            // loop again if has child nodes
//                            nodeList = tempNode.getChildNodes();
//
//                        }
//
//                        System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");
//
//                    }
//
//                }
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    
    
    
    
    
    
    
    
    
    }
    
}
