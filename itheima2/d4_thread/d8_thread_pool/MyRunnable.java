package com.itheima2.d4_thread.d8_thread_pool;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "输出666~~~");
        try {
            Thread.sleep(Integer.MAX_VALUE); //让线程一直工作, 拖住线程
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
