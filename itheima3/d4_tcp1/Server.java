package com.itheima3.d4_tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server starting...");
        //1.创建ServerSocket对象, 同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用serverSocket的accept方法 等待客户端请求， 若请求成功则生成socket对象
        Socket socket = serverSocket.accept();
        //3.从socket通信管道中得到一个字节输入流
        InputStream is = socket.getInputStream();
        //4.把原始的字节输入流包装成数据输入流
        DataInputStream dis = new DataInputStream(is);
        //5.使用数据输入流读取客户端发送过来的消息
        String rs = dis.readUTF();
        System.out.println(rs);
        //获取客户端的IP地址
        System.out.println(socket.getRemoteSocketAddress());
        //4.释放资源
        dis.close();
        socket.close();
    }
}
