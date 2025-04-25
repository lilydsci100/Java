package com.itheima2.d1_properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个properties的对象出来(键值对集合:空容器)
        Properties properties = new Properties();

        //2.开始加载属性文件中的键值对数据到properties对象去
        properties.load(new FileReader("helloworld-app\\src\\com\\itheima2\\d1_properties\\users.properties")); //使用字符输入流, 读取属性文件里的键值对数据
        System.out.println(properties);

        //3.根据键取值
        System.out.println(properties.getProperty("Tom"));//根据键获取值
        System.out.println(properties.getProperty("Tim"));

        //4.遍历全部的键和值
        Set<String> keys = properties.stringPropertyNames(); //获取全部键的集合
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + " ---> " + value);
        }

        properties.forEach((key, value) -> {
            System.out.println(key + " ---> " + value);
        });
    }
}
