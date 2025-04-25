package com.itheima2.d1_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest3 {
    public static void main(String[] args) throws Exception {
        //改变sam的年龄到18
        //1.创建一个properties的对象出来(键值对集合:空容器)
        Properties properties = new Properties();

        //2.开始加载属性文件中的键值对数据到properties对象去
        properties.load(new FileReader("helloworld-app\\src\\com\\itheima2\\d1_properties\\users3.properties"));

        //3.判断是否包含sam这个键
        if(properties.containsKey("Sam")){
            properties.setProperty("Sam", "18");
        }

        //4.把properties对象的键值对数据写到属性文件中
        properties.store(new FileWriter("helloworld-app\\src\\com\\itheima2\\d1_properties\\users3.properties"), "success!");


    }
}
