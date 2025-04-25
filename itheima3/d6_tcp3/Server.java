package com.itheima3.d6_tcp3;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server starting...");
        //1.创建ServerSocket对象, 同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println(Thread.currentThread().getName() + ": Server Reader Thread");
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + ": 上线了");
            new ServerReaderThread(socket).start();
        }


    }
}
