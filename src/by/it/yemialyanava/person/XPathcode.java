package by.it.yemialyanava.person;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class XPathcode {
    private static InputSource inputSource = new InputSource("D://persons.txt");
    private static XPath xPath = XPathFactory.newInstance().newXPath();

    private static String getInformation (String expression) throws XPathExpressionException {
        NodeList nodelist = (NodeList)xPath.evaluate(expression, inputSource, XPathConstants.NODESET);
        int length = nodelist.getLength();
        StringBuilder sb= new StringBuilder();
        for (int i= 0; i< length; i++){
            Node node = nodelist.item(i);
            sb.append(node.getTextContent()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws XPathExpressionException {
        /*String expression = "/Persons/Person/FirstName";
        System.out.println(getInformation(expression));*/
       String expression = "/Persons/Person/FirstName | /Persons/Person/Race";
       System.out.println(getInformation(expression));
    }

}
