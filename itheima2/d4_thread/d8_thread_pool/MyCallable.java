package com.itheima2.d4_thread.d8_thread_pool;

import java.util.concurrent.Callable;

/*
    1.让这个类实现Callable接口
 */
public class MyCallable implements Callable<String> {
    //2.重写call方法
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        //描述线程任务并返回线程执行返回后的结果
        //需求: 求1-n的和返回
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName()+ "求出了1-" + n + "的和: " + sum;
    }
}
