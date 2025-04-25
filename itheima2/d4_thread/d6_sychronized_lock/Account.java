package com.itheima2.d4_thread.d6_sychronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    //1.创建锁对象, 位置放在这是因为每一个账户应该有自己独特的锁对象 加final保证lk不会被二次赋值
    private final Lock lk = new ReentrantLock();

    public Account() {}

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName(); //是谁取得钱?
        lk.lock();
        try {
            if (this.money >= money) {
                System.out.println(name + "来取钱" + money + "成功");
                this.money -= money;
                System.out.println(name + "来取钱后余额剩余" + this.money);
            }else {
                System.out.println(name + "来取钱, 余额不足");
            }
        } finally {
            lk.unlock();
        }

    }
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
