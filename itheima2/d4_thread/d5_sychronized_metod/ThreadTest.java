package com.itheima2.d4_thread.d5_sychronized_metod;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account("ICBC-110",100000);
        new DrawThread(acc,"小明").start(); //小明
        new DrawThread(acc,"小红").start(); //小红
    }
}
