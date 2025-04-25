package com.itheima2.d4_thread.d2_thread_api;

public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            //休眠5s
            if (i == 3) {
                Thread.sleep(5000);
            }
        }

        //join方法作用: 让当前调用这个方法的线程先执行完
        Thread t1 = new MyThread("Thread1");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("Thread2");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("Thread3");
        t3.start();
        t3.join();

    }
}
