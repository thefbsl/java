package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Main {

    public static void main(String[] args) {
        String path = "knb.xml";
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(path);
            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nl = doc.getElementsByTagName("pl");
            for(int i = 0; i < nl.getLength(); i++){
                Node node = nl.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element el = (Element) node;
                    int id = Integer.valueOf(el.getAttribute("id"));
                    String name = el.getElementsByTagName("name").item(0).getTextContent();
                    String skill = el.getElementsByTagName("skill").item(0).getTextContent();
                    String number = el.getElementsByTagName("number").item(0).getTextContent();

                    System.out.println("Player " + (i + 1));
                    System.out.println("name: " + name );
                    System.out.println("skill: " + skill);
                    System.out.println("number: " + number);
                    System.out.println(" ");;
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
