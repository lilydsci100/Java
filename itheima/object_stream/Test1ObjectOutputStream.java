package com.itheima.object_stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1ObjectOutputStream {
    public static void main(String args[]){
        try (
                //2.创建一个对象字节输出流包装原始的字节输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("helloworld-app\\src\\itheimaObjetstream.txt"));
        ) {
            //1.创建一个Java对象
            User u = new User("user1234","user1111","1111",23);
            //3.序列化对象到文件中去
            oos.writeObject(u);
            System.out.println("Object written to file！");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
