package com.itheima.byte_stream;

import java.io.*;

public class FileInputStreamTest3 {
    public static void main(String[] args) throws IOException {
        //1. 创建字节输入流对象代表字节输入流管道与源文件接通
        InputStream is = new FileInputStream("helloworld-app\\src\\itheima03.txt");

        //2.准备一个字节数组，大小与file的大小正好一样大
        // public read(byte[])
//        File f = new File("helloworld-app\\src\\itheima03.txt");
//        long size =  f.length();
//        byte[] buf = new byte[(int) size]; //字节存在于内存中，file的大小是在硬盘中 内存很小，硬盘很大 对于小文件可以实施强转 对于大文件就不行
//
//        int len = is.read(buf);
//        System.out.println(new String(buf));
//
//        System.out.println(size);
//        System.out.println(len);

        //3.改造版
        byte[] buf = is.readAllBytes();
        System.out.println(new String(buf));
        is.close();
    }
}
