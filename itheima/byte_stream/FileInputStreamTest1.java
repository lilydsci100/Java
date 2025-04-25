package com.itheima.byte_stream;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输入流观管道
        InputStream in = new FileInputStream("helloworld-app\\src\\itheima01.txt");
        //2.开始读取文件的字节数据
//        int b1 = in.read(); //一次读取一个字节并返回，如果没有数据了 返回-1
//        System.out.println((char)b1);
//
//        int b2 = in.read();
//        System.out.println((char)b2);
//
//        int b3 = in.read();
//        System.out.println((char)b3);

        //3.使用循环改造2
        int b;
        while ((b = in.read()) != -1) {
            System.out.print((char)b); //println输出一根棍
        }

        //读取性能很差，读取汉字输出会出乱码
        //关闭流管道 释放系统资源
        in.close();
    }
}
