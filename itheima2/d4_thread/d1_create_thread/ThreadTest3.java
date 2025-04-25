package com.itheima2.d4_thread.d1_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        //3.创建Callable对象
        Callable<String> call = new MyCallable(100);
        //4.把Callable的对象封装成一个FutureTask对象(任务对象)
        //FutureTask的作用
        //1)是一个任务对象, 实现Runnable对象
        //2)可以在线程执行完毕之后, 用FutureTask对象调用get方法获取线程执行完毕后的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        //5.把任务对象交给一个Thread对象
        new Thread(f1).start();

        //6.获取线程执行完毕后返回的结果
        //如果执行到这, 上面的线程还没有执行完毕则这里的代码会暂停, 等待上面线程执行完毕后才会获取结果
        String rs = f1.get(); //get拿到的结果就是call方法的结果
        System.out.println(rs);
    }
}
