package com.itheima.file;

import java.io.File;

public class FileTest2 {
    public static void main(String[] args) {
        //常用的方法
        //1. 创建文件对象，指代某个文件(指代某个存在的文件)
        File f1 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\P706");
        //2.判断当前文件对象，对应的文件路径是否存在
        f1.exists();
        //3. 判断当前文件对象指代的是否是文件，是文件返回true，反之
        f1.isFile();
        //4. 判断当前文件对象指代的是否是文件夹，是文件返回true，反之
        f1.isDirectory();
        //5.获取文件的名称（包含后缀）
        f1.getName();
        //6.获取文件的大小，返回字节个数
        f1.length();
        //7.获取文件的最后修改时间
        f1.lastModified();
        //8.获取创建文件对象时，使用的路径 (创建时用的绝对路径结果就是绝对路径，反之亦然)
        f1.getPath();
        //9.获取绝对路径
        f1.getAbsolutePath();
        System.out.println(f1.getParent());

    }

}
