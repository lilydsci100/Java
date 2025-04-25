package com.itheima.exercise;

import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {
        //case 穿透案例
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int week = sc.nextInt();
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("Workday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Doesn't exist!");
        }
    }
}
