package com.itheima2.d4_thread.d10_test;

import java.util.List;
import java.util.Random;

public class SendThread extends Thread {
    private List<String> gift;
    private int count;
    public SendThread(List<String> gift, String name) {
        super(name);
        this.gift = gift;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        //不能写synchronized this. 因为xm和xh不是共享sendThread
        //之前account例子也是在account class里进行synchronized, 并没在thread里进行 synchronized
        //注意:锁必须唯一
        Random r = new Random();
        while (true) {
            synchronized (gift) {
                if(gift.size() < 10) {
                    break;
                }
                String rs =  gift.remove(r.nextInt(gift.size()));
                System.out.println(name + "发出了" + rs);
                count++; //每个线程对象加自己独特的count
            }
        }

    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
