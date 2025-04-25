package com.itheima3.d2_upd1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        //1.创建服务端对象 接韭菜的人
        DatagramSocket socket = new DatagramSocket(6666);
        //2.创建一个数据包对象用来接数据 (创建一个接韭菜的盘子)
        byte[] buf = new byte[1024*64]; //64KB
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3.接数据包数据
        socket.receive(packet);

        //4.从字节数组中, 把接收到的数据直接打印出来
        //接受多少就倒出多少
        //获取本次数据包接收了多少数据
        int len = packet.getLength(); //getLength(): 获取数据包, 实际接收到的字节个数
        String msg = new String(buf,0,len);
        System.out.println(msg);

        System.out.println(packet.getAddress().getHostAddress());//客户端IP地址
        System.out.println(packet.getPort());//客户端端口

        socket.close();//释放资源
    }
}
