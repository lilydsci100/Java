package com.itheima3.d9_tcp6;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable {
    private Socket socket;
    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type: text/html;charset=UTF-8");
            ps.println();//必须换行
            ps.println("<div style='color:red;font-size:120px;text-align:center;'>黑马6666</div>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
