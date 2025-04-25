package com.itheima.buffered_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderTest2 {
    public static void main(String[] args) {
        try(
                Reader fr = new FileReader("helloworld-app\\src\\ieheima04.txt");
                //1.创建字符缓冲输入流包装原始的字符输入流
                BufferedReader br = new BufferedReader(fr); //不要用多态，因为bufferReader有自己独特的方法
                ) {
            char[] buf = new char[3];
            int len;
            while ((len = br.read(buf)) != -1) {
                System.out.print(new String(buf, 0, len));
            }

            //public String readLine() 读取一行字符，若没有返回null
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());

            //提升版
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
