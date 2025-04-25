package com.itheima.exercise;

import java.util.Scanner;

public class ifWhile {
    //回文
    public static void main(String[] args) {
        int x = 121;
        int temp = x;
        int num = 0;
        while (x!=0) {
            int current = x%10;
            x = x/10;
            num = num*10 + current;
        }
        boolean b = num == temp? true: false;
        System.out.println(b);
    }
    //求平方根
    public void squreRoot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = sc.nextInt();
        for (int i = 1; i<= num; i++) {
            if (i * i == num) {
                System.out.println("平方根为 " + i);
                break;
            } else if (i * i > num) {
                System.out.println("平方根为 " + (i-1));
                break;
            }
        }
    }
}
