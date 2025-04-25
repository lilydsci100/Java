package com.itheima2.d4_thread.d4_sychronized_code;

public class Account {
    private String cardId;
    private double money;
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    public Account() {}
    //静态方法推荐使用类.class作为共享资源
    //public static void test() {synchronized (Account.class) {}}

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName(); //是谁取得钱?
        //this代表共享资源,若是“heima”, 在执行小明线程时, 不仅会锁住acc也会锁住acc1. 因为heima不是共享资源
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "来取钱" + money + "成功");
                this.money -= money;
                System.out.println(name + "来取钱后余额剩余" + this.money);
            }else {
                System.out.println(name + "来取钱, 余额不足");
            }
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
