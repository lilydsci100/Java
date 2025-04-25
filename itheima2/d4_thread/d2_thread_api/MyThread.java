package com.itheima2.d4_thread.d2_thread_api;

/**
 * 1.让子类继承Thread线程类
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);//为当前线程取名字
    }

    public MyThread() {}

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i < 5; i++) {
            System.out.println(t.getName() + "输出" + i);
        }
    }
}
