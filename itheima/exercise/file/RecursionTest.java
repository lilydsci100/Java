package com.itheima.exercise.file;

import java.io.File;

public class RecursionTest {
    public static void main(String[] args) {
    }
    //从D盘中搜索“QQ.exe”这个文件，找到后输出其位置

    /**
     * 去目录下搜索某个文件
     * @param dir 目录
     * @param fileName 文件名
     */
    public static void searchFile(File dir, String fileName) {
        //非法情况：dir不存在，dir是文件， dir是null
        if(dir == null || !dir.exists() || !dir.isFile()) {
            return;
        }

        //取得files
        File[] files = dir.listFiles();

        //获取目录中的所有一级文件并且确保能拿到一级文件
        if(files != null || files.length > 0) { //没有权限访问 or 空目录
            for (File file : files) {
                if (file.isDirectory()) { //是文件夹
                    searchFile(file, fileName); //传输的是文件夹，不是文件所以非法情况hi有
                } else { //是文件
                    if (file.getName().contains(fileName)) { //找到了
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("didn't find " + fileName);
        }
    }
}
