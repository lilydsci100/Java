package com.itheima3.d7_tcp4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
//TCP通信-端口转发
public class Server {
    //只此一个, 建立静态变量
    public static List<Socket> onlineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("Server starting...");
        //1.创建ServerSocket对象, 同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println(Thread.currentThread().getName() + ": Server Reader Thread");
        while (true) {
            //2.使用serverSocket对象调用accept方法来等待客户端连接请求
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + ": 上线了");
            onlineSockets.add(socket); //将上线的socket加入集合
            //3. 把这个客户端对应的socket通信管道, 交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }


    }
}
