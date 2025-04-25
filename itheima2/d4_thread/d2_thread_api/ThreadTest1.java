package com.itheima2.d4_thread.d2_thread_api;

public class ThreadTest1 {
    public static void main(String[] args) {

        Thread t1 = new MyThread("Thread1");
        //t1.setName("Thread1");
        t1.start();
        System.out.println(t1.getName()); //Thread1

        Thread t2 = new MyThread();
        t2.setName("Thread-2");
        t2.start();
        System.out.println(t2.getName()); //Thread-2

        //主线程对象的名字
        //哪个线程执行它,它就会得到那个线程对象
        Thread m = Thread.currentThread();//获取当前线程对象
        System.out.println(m.getName());


        for (int i = 1; i < 5; i++) {
            System.out.println("主线程main输出" + i);
        }

    }
}
