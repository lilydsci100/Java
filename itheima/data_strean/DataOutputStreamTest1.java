package com.itheima.data_strean;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest1 {
    public static void main(String[] args) {
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("helloworld-app\\src\\itheimaDatastream.txt"));
                ){
            dos.writeInt(10);
            dos.writeDouble(79.5);
            dos.writeBoolean(true);
            dos.writeUTF("黑马666");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
