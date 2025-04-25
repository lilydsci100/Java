package com.itheima2.d4_thread.d5_sychronized_metod;

public class DrawThread extends Thread {
    private Account acc;
    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        //取钱
        acc.drawMoney(100000);
    }
}
