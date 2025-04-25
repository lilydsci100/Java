package com.itheima2.d4_thread.d10_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        // 目标: 有100份礼品, 小红小明两人同时发送, 当剩下的礼品小于10份时则不再送出
        //1.拿100份礼品到程序中来
        List<String> gift = new ArrayList<String>();
        String[] names = {"lipstic","eyshadow","watch","belt","flower","chocolate"};
        Random r = new Random();
        for (int i =0; i<100; i++){
            gift.add(names[r.nextInt(names.length)] + (i+1));
        }
        System.out.println(gift);

        //2.用简单代码创建两个线程去抢礼物发出去
        SendThread xm = new SendThread(gift,"xm");
        xm.start();
        SendThread xh = new SendThread(gift, "xh");
        xh.start();

        xm.join(); //保证让线程先执行完再返回count值, 避免出现线程没执行完就fetch count值
        xh.join();

        System.out.println(xm.getCount());
        System.out.println(xh.getCount());


    }
}