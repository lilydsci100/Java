package com.itheima2.d4_thread.d6_sychronized_lock;

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
