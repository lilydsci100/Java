package com.itheima.exercise.file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //goal:改变某个文件夹下视频序号，要求从19开始
        //find the folder
        File f1 = new File("E:\\aaa\\bbb\\ccc\\video");
        //get all files
        File[] files = f1.listFiles();
        int index = 19;
        for (File file : files) {
            //get name of each file
            String name = file.getName();
            //change the name
            String newname = index + '、' + name.substring(name.indexOf('、',0)+1);
            //change the pathName
            String newPathName = file.getParent() + File.separator + newname;
            file.renameTo(new File(newPathName));
            index++;

//          另一种写法
//          String index = name.substring(0,name.indexOf('、'));
//          String lastName = name.substring(name.indexOf('、'));
//          String newName = (Integer.valueOf(index) + 18) + lastName;
//          file.renameTo(new File(f1,newName));
        }
    }
}
