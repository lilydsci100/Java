package com.itheima3.d9_tcp6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server starting...");
        //1.创建ServerSocket对象, 同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8080);
        //创建出一个线程池, 负责处理通信管道的任务
        ThreadPoolExecutor pool = new ThreadPoolExecutor(16*2,16*2, 0,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            //2.使用serverSocket对象调用accept方法来等待客户端连接请求
            Socket socket = serverSocket.accept();

            pool.execute(new ServerReaderRunnable(socket));
        }


    }
}
