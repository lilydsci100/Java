package com.itheima.byte_stream.exercise;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //需求：复制d盘照片到c盘
        //1.创建字节输出流和输入流
        InputStream is = new FileInputStream("D:\\resource\\meitu.png");
        OutputStream os = new FileOutputStream("C:\\resource\\meitu2.png"); //meitu.png需要自己写 也可以重命名为meitu2.png

        //2.创建字节数组
        byte[] buffer = new byte[1024]; //1KB
        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        os.close(); //必须先关闭os再关闭is
        is.close();
        System.out.println("Done");

    }
}
