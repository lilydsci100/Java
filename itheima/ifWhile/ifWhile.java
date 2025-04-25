package com.itheima.ifWhile;

public class ifWhile {
    public static void main(String[] args) {
        //i只在循环内有效
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        //i在循环外也有效
        int i = 0;
        while (i < 5) {
            i++;
        }
        System.out.println(i);

        //无限循环和结束循环
        //continue跳出循环
        for (int t = 1; t<=5; t++) {
            System.out.println(t);
            if(t == 3) {
                //结束本次循环，继续下次循环
                continue;
            }
        }
        //break结束循环
        for (int t = 1; t<=5; t++) {
            System.out.println(t);
            if(t == 3) {
                //结束本次循环，继续下次循环
                break;
            }
        }


    }
}
