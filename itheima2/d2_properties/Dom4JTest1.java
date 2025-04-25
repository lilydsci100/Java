package com.itheima2.d2_properties;

import com.sun.jdi.connect.AttachingConnector;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4JTest1 {
    public static void main(String[] args) throws Exception {
        //1. 创建一个Dom4J框架提供的解析器对象
        SAXReader saxReader = new SAXReader();

        //2. 使用saxReader对象把需要解析的XML文件读成一个Document对象
        Document document = saxReader.read("helloworld-app\\src\\com\\itheima2\\d2_properties\\helloworld.xml");

        //3.从文档对象中解析XML文件的全部数据了
        Element root = document.getRootElement();
        System.out.println(root.getName());

        //4.获取根元素下的全部一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        //5.获取根元素下的全部特定一级子元素
        List<Element> elements1 = root.elements("user");
        for (Element element : elements1) {
            System.out.println(element.getName());//获取这个标签的名字
        }

        //6.获取当前元素下的某个子元素
        Element people = root.element("people");
        System.out.println(people.getText());//获取people标签的文本

        //如果下面有很多子元素user,默认获取第一个
        Element user = root.element("user");
        System.out.println(user.elementText("name"));//得到指定名称的子元素文本

        //7.获取元素的属性信息
        System.out.println(user.attributeValue("id")); //获取user标签中的属性id的值
        Attribute id = user.attribute("id");
        System.out.println(id.getName());//获取属性名称
        System.out.println(id.getValue());//获取属性值

        List<Attribute> attributes = user.attributes(); //获取user标签中的全部属性
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName() + "=" + attribute.getValue());
        }

        //8.如何获取全部的文本内容, 获取当前元素下的子元素文本值
        //1)用elementText
        System.out.println(user.elementText("name"));
        System.out.println(user.elementText("address"));
        System.out.println(user.elementTextTrim("address"));
        System.out.println(user.elementText("password"));

        //2)创建Element对象
        Element data = user.element("data");
        System.out.println(data.getText());

        Element name = user.element("name");
        System.out.println(name.getText());

    }
}
