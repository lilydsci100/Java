package com.itheima.buffered_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterTest3 {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("helloworld-app\\src\\ieheima05.txt", true);
                //创建字符缓冲输出流包装原始的字符输出流
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            bw.write("Hello World");
            bw.newLine();
            bw.write("我爱天津");
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
