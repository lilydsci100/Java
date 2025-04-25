package com.itheima3.d6_tcp3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(Thread.currentThread().getName() + ": Server Reader Thread");
            while (true) {
                try {
                    String rs = dis.readUTF();
                    System.out.println(rs);
                } catch (Exception e) {
                     System.out.println(socket.getRemoteSocketAddress() + "设备离线了");
                     dis.close();
                     socket.close();
                     System.out.println(socket.getRemoteSocketAddress() + ": 下线了");
                     break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
