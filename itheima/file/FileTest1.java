package com.itheima.file;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        //创建一个file对象
        File f1 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\P706\\P706-113-Line List.xlsx"); //双反斜杠 or 单斜杠
        // File f2 = new File("C:" + File.separator + "Users" + ....)
        f1.length(); //文件大小 x字节

        //file定位某一个文件夹
        File f3 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\P706");
        f3.length();//这个文件夹本身的大小 不是装入文件的大小

        //file对象可以指代一个不存在的文件路径,方便后续创造文件
        File f4 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\P706\\aaaa.txt");
        f4.length();
        f4.exists(); //false

        //定位的文件是在模块中
        //绝对路径：带盘符的
        File f5 = new File("C:\\Users\\avb\\Desktop\\Java\\helloworld-app\\src\\com\\itheima"); //路径容易丢失
        //相对路径：不带 默认是直接去工程下找文件
        File f6 = new File("Java\\helloworld-app\\src\\com\\itheima");
    }
}
