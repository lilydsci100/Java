package com.itheima2.d4_thread.d5_sychronized_metod;


public class Account {
    private String cardId;
    private double money;
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public Account() {}

    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName(); //是谁取得钱?
        if (this.money >= money) {
            System.out.println(name + "来取钱" + money + "成功");
            this.money -= money;
            System.out.println(name + "来取钱后余额剩余" + this.money);
        }else {
            System.out.println(name + "来取钱, 余额不足");
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
