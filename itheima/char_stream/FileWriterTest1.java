package com.itheima.char_stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterTest1 {
    public static void main(String[] args) {
        try(
//                //覆盖管道
//                Writer fw = new FileWriter("helloworld-app\\src\\itheima01.txt")
                //追加管道
                Writer fw = new FileWriter("helloworld-app\\src\\itheima01.txt", true);
                ) {
            //public void write(int c)
            fw.write("a");
            fw.write(97);
            fw.write('磊');
            fw.write("\r\n"); //换行
            //public void write(String str)
            fw.write("我爱中国abc");
            fw.write("\r\n");

            //public void write(String str, int off, int len)
            fw.write("我爱中国abc",0,5);
            fw.write("\r\n");
            //public void write(char[] cbuf)
            char[] buffer = {'黑', '马', 'a', 'b', 'c'};
            fw.write(buffer);
            fw.write("\r\n");
            //public void write(char[] cbuf, int off, int len)
            fw.write(buffer,0,2);
            fw.write("\r\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
