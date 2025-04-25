package com.itheima.exercise.switchdemo;

public class SwitchDemo {
    public static void main(String[] args) {
        //简化写法
        int number = 10;
        switch(number) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("default");
        }

    }
}
