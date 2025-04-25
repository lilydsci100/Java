package com.itheima.buffered_stream;

import java.io.*;

public class BufferedInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        try (
                InputStream is  = new FileInputStream("helloworld-app\\src\\ieheima05.txt");
                //1.定义一个字节缓冲输入流包装原始的字节输入流
                InputStream bis = new BufferedInputStream(is);


                OutputStream os  = new FileOutputStream("helloworld-app\\src\\ieheima05.txt");
                //2.定义一个字节缓冲输出流包装原始的字节输出流
                OutputStream bos = new BufferedOutputStream(os);
                ){
            //3.定义buffer
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
