package com.itheima.file;

import java.io.File;
import java.util.Arrays;

public class FileTest4 {
    public static void main(String[] args) {
        //public String[] list() 获取当前目录下所有的"一级文件名称"到一个字符串数组中
        File f1 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file");
        for (String f : f1.list()) { //f1.list()是一个字符串数组
            System.out.println(f);
        }
        //public File[] listFiles(): 获取当前目录下所有的"一级文件对象"
        File f2 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file");
        File[] files = f2.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsoluteFile());
        }

        //当主调是文件或者路径不存在时返回null
        File f3 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file\\NotExist");
        File[] files3 = f3.listFiles();
        System.out.println(files3);

        //当主调是空文件夹时，返回一个长度为0的数组
        File f4 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file\\fileTest4.1");
        File[] files4 = f4.listFiles();
        System.out.println(Arrays.toString(files4));
        //当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中放回
        File f5 = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file\\aaa");
        File[] files5 = f5.listFiles();
        for (File f : files5) {
            System.out.println(f.getAbsoluteFile());
        }
        //当主调是一个文件夹并且里边有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中放回，包含隐藏文件
        //当主调是一个文件夹但是没有权限访问该文件夹时返回null
    }
}
