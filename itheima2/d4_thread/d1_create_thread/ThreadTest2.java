package com.itheima2.d4_thread.d1_create_thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        //3.创建任务对象
        Runnable target = new MyRunnable();
        //4.把任务对象交给一个线程对象处理
        new Thread(target).start();

        for (int i = 1; i < 5; i++) {
            System.out.println("主线程输出===》" + i);
        }
    }
}
