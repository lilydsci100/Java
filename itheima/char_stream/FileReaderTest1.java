package com.itheima.char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest1 {
    public static void main(String[] args) {
        try (
                //1.创建字符输入流管道 读取磁盘的内容
                Reader fr = new FileReader("helloworld-app\\src\\itheima01.txt");
                ){
//            //2.读取文本文件的内容了
//            int c; //记住每次读取的字符编号
//            while ((c = fr.read()) != -1) {
//                System.out.print((char) c);
//            }
//            //每次读取一个字符的姓氏，性能是比较差的

            //每次读取多个字符
            char[] buf = new char[3];
            int len; //字符编号
            while ((len = fr.read(buf)) != -1) {
                System.out.print(new String(buf, 0, len));
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}
