package com.itheima.exercise.file;

import java.io.File;

public class RecursionTest2 {
    public static void main(String[] args) {
        //删除非空文件夹
        File file = new File("C:\\Users\\avb\\OneDrive\\Desktop\\Java file\\Recursion Test2");
        deleteDir(file);
    }

    public static void deleteDir(File file) {
        //非法
        if (file == null || !file.exists()) {
            return;
        }
        //是文件
        if (file.isFile()) {file.delete();}

        //是文件夹
        //获取文件夹中的一级文件
        File[] files = file.listFiles();
        //当前文件夹没有权限
        if (files == null) {
            return;
        }
        //当前目录为空，直接delete
        if (files.length == 0) {file.delete();}

        //有权限或者为非空文件夹
        if (files != null && files.length > 0) {
            for (File f : files) {
                if (f.isFile()) {
                    f.delete();
                } else {
                    deleteDir(f);
                }
            }
        }
//      简略版，无需if (files != null && files.length > 0)
//        for (File f : files) {
//            if (f.isFile()) {
//                f.delete();
//            } else {
//                deleteDir(f);
//            }
//        }

        file.delete();
    }
}
