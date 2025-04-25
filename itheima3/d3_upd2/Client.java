package com.itheima3.d3_upd2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建客户端对象 扔韭菜的人
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请说: ");
            String msg = sc.nextLine();

            //一旦发现用户输入exit命令, 就退出客户端
            if("exit".equals(msg)) {
                System.out.println("欢迎下次光临!退出成功!");
                socket.close();
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),6666);
            socket.send(packet);
            System.out.println("客户端数据发送完毕");
        }
    }
}
