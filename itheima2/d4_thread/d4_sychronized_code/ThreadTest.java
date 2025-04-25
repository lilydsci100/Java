package com.itheima2.d4_thread.d4_sychronized_code;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account("ICBC-110",100000);
        new DrawThread(acc,"小明").start(); //小明
        new DrawThread(acc,"小红").start(); //小红

        Account acc1 = new Account("ICBC-111",100000);
        new DrawThread(acc1,"小黑").start();
        new DrawThread(acc1,"小白").start();
    }
}
