package factoryMethod2.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class XMLUtil {
    //从XML配置文件中提取具体的类名，并返回一个实例
    public static Object getFactory(){
        Object object = null;
        try{
        //创建DOM文档对象
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("/Users/apple/Documents/java设计模式/模式代码/src/factoryMethod2/config/config.xml"));
        //获取相应的文本节点（类名）
        NodeList nodeList = document.getElementsByTagName("className");
        Node classNode = nodeList.item(0).getFirstChild();
        String className = classNode.getNodeValue();
        //反射对象
        Class c = Class.forName(className);
        object = c.getDeclaredConstructor().newInstance();

        }catch (Exception e) {
            System.out.println("工厂创建异常");
        }
        return object;
    }
}
