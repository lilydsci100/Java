package com.itheima.byte_stream;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        //1. 创建字节输入流对象代表字节输入流管道与源文件接通
        InputStream is = new FileInputStream("helloworld-app\\src\\itheima01.txt");
        //2.开始读取文件中的字节数据，每次读取多个字节
        //创建自定义字节数组
//        byte[] buf = new byte[3];
        //读取自定义字节数据
//        int len = is.read(buf);
//        String s = new String(buf);
//        System.out.println(s);
//        System.out.println("当前读取的字节数量" + len);
//        //buf = [abc]
//        //buf = [dec]
//        int len2 = is.read(buf);
//        String s2 = new String(buf);
//        System.out.println(s2);
//        System.out.println("当前读取的字节数量" + len2);
//
//        int len3 = is.read(buf);
//        String s3 = new String(buf); // -1

        //3.使用循环改造
        byte[] buf = new byte[3];
        int len;
        while ((len = is.read(buf)) != -1){ //for (len = is.read(buf); len != -1; len = is.read(buf)) <- 如果用for就是这个样子
            System.out.println(new String(buf, 0, len));
        };
        //读取性能得到了提升，但读取汉字输出还是会乱码
        is.close();
    }



}
