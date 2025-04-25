package com.itheima2.d4_thread.d1_create_thread;

public class ThreadTest2_2 {
    public static void main(String[] args) {
        //3.创建Runnable接口的匿名内部类形势的任务对象
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println("子线程1输出===》" + i);
                }
            }
        };
        //4.把任务对象交给一个线程对象处理
        new Thread(target).start();

        //简化形式1:匿名内部类:
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println("子线程2输出===》" + i);
                }
            }
        }).start();

        //简化形式2:lambda:
        new Thread(() -> {
                for (int i = 1; i < 5; i++) {
                    System.out.println("子线程2输出===》" + i);
                }
        }).start();


        for (int i = 1; i < 5; i++) {
            System.out.println("主线程输出===》" + i);
        }
    }
}
