package com.itheima3.d2_upd1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建客户端对象 扔韭菜的人
        DatagramSocket socket = new DatagramSocket();
        //2.创建数据包对象封装要发出去的数据(创建一个韭菜盘子)
        byte[] bytes = "我是快乐的客户端, 我爱abc".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),6666);
        //3.发送数据包数据
        socket.send(packet);
        System.out.println("客户端数据发送完毕");
        socket.close();//释放资源
    }
}
