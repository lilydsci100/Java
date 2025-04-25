package com.itheima3.d7_tcp4;

import java.io.*;
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
                    //把消息转发到全部客户端进行接收
                    sendMsgToAll(rs);
                } catch (Exception e) {
                     System.out.println(socket.getRemoteSocketAddress() + "设备离线了");
                     System.out.println(socket.getRemoteSocketAddress() + ": 下线了");
                     Server.onlineSockets.remove(socket); //将socket移出集合
                     dis.close();
                     socket.close();
                     break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void sendMsgToAll(String msg) throws Exception {
        //发送给全部在线的socket管道接收
        for (Socket onlineSocket : Server.onlineSockets) {
            OutputStream os = onlineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
