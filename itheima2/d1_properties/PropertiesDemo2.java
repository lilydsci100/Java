package com.itheima2.d1_properties;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        //1.创建一个properties的对象出来(键值对集合:空容器)
        Properties properties = new Properties();

        //2.保存键值对数据到properties对象去
        properties.setProperty("firstName", "John");
        properties.setProperty("lastName", "Smith");
        properties.setProperty("email", "john.smith@gmail.com");

        //3.把properties对象中的键值对数据存入到属性文件中去
        properties.store(new FileWriter("helloworld-app\\src\\com\\itheima2\\d1_properties\\users2.properties"),"save users");

    }
}
