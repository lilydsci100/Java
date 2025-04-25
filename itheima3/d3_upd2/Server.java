package com.itheima3.d3_upd2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server starting...");
        DatagramSocket socket = new DatagramSocket(6666);

        byte[] buf = new byte[1024*64]; //64KB
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        while (true) {
            socket.receive(packet);
            int len = packet.getLength(); //getLength(): 获取数据包, 实际接收到的字节个数
            String msg = new String(buf,0,len);
            System.out.println(msg);

            System.out.println(packet.getAddress().getHostAddress());//客户端IP地址
            System.out.println(packet.getPort());//客户端端口
            System.out.println("------------");
        }
    }
}
