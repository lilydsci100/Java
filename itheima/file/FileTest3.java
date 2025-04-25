package com.itheima.file;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        //创建新文件，创建成功返回true
        File f1 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file\\FileTest3.txt");
        System.out.println(f1.createNewFile());
        //创建文件夹，只能创建一级文件夹
        File f2 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file\\aaa");
        f2.mkdir();
        //创建文件夹，创建多级文件夹
        File f3 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file\\aaa\\bbb\\ccc");
        f3.mkdirs();
        //删除文件或空文件夹， 不能删除非空文件夹
        System.out.println(f1.delete()); //true
        System.out.println(f2.delete());//true
        File f4 = new File("C:\\Users");
        System.out.println(f4.delete()); //false
    }
}