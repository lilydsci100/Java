package com.itheima2.d4_thread.d7_thread_communication;

public class ThreadTest {
    public static void main(String[] args) {
        Desk desk = new Desk();

        //创建3个生产者线程
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师1").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师2").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师3").start();

        //创建2个消费者线程
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "吃货1").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "吃货2").start();
    }
}
