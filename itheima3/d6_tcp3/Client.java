package com.itheima3.d6_tcp3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建socket对象, 并同时请求与服务端程序的连接
        Socket socket = new Socket("192.168.79.1", 8888); //本机地址, 自定义port

        //2.socket通信管道中得到一个字节输出流,用来发数据给服务端程序
        OutputStream os = socket.getOutputStream();

        //3.把低级字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                dos.close();
                socket.close();
                System.out.println("Client disconnected.");
                break;
            }
            //4.开始写数据出去
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
