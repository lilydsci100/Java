package com.itheima4.d1_junit;

public class StringUtil {
    public static void printNumber(String name) {
        if(name == null) {
            System.out.println(0);
            return;
        }
        System.out.println("The length of name is " + name.length());
    }

    public static int getMaxIndex(String data) {
        if(data == null) {
            return -1;
        }
        return data.length() - 1;
    }
}
