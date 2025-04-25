package com.itheima.byte_stream.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {
    public static void main(String[] args) {
        try(
                //注意：这里只能放置资源对象 （流对象）
                //资源都是会实现AutoCloseable接口。资源都会有一个close方法 用完之后，会被自动调用其close方法完成资源的释放操作
                InputStream is = new FileInputStream("D:\\resource\\meitu.png");
                OutputStream os = new FileOutputStream("C:\\resource\\meitu2.png");
                ){
            byte[] buffer = new byte[1024]; //1KB
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
