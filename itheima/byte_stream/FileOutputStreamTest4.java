package com.itheima.byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamTest4 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输出流管道与目标文件接通
        //覆盖管道：覆盖之前的数据
//        OutputStream os  = new FileOutputStream("helloworld-app\\src\\ieheima04.txt");

        //追加数据的管道
        OutputStream os  = new FileOutputStream("helloworld-app\\src\\ieheima04.txt",true);

        //2.开始写字节数据出去了
        os.write(97);//97就是一个字节，代表a
        os.write('b');//‘b'也是一个字节
        //os.write('磊'); //报错，不能这么写

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);

        os.write(bytes,0,15);//从’我‘这个index开始写入

        //换行符
        os.write("\r\n".getBytes());

        os.close();
    }
}
