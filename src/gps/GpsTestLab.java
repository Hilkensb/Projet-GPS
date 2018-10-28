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
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.transform.*; 
import javax.xml.transform.dom.DOMSource; 
import javax.xml.transform.stream.StreamResult;


public class GpsTestLab {

 static public void main(String[] arg) throws Exception{

 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 DocumentBuilder builder = factory.newDocumentBuilder();
 Document doc = builder.parse("C:\\Users\\bramh_000\\Bureau\\test\\kt2.gpx");

 TransformerFactory tranFactory = TransformerFactory.newInstance(); 
 Transformer aTransformer = tranFactory.newTransformer(); 


 NodeList list = doc.getFirstChild().getChildNodes();

 for (int i=0; i<list.getLength(); i++){
    Node element = list.item(i).cloneNode(true);

 if(element.hasChildNodes()){
   Source src = new DOMSource(element); 
   FileOutputStream fs=new FileOutputStream("C:\\Users\\bramh_000\\Bureau\\test\\ktr" + i + ".gpx");
   Result dest = new StreamResult(fs);
   aTransformer.transform(src, dest);
   fs.close();
   }
   }

  }
}
 

