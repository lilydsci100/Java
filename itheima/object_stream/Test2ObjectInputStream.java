package com.itheima.object_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2ObjectInputStream {
    public static void main(String[] args) {

        try (
                //1.创建对象字节输入流管道, 包装低级的字节输入流与源文件接通
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("helloworld-app\\src\\itheimaObjetstream.txt"));
                ){
            User user = (User) ois.readObject();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
