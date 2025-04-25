package com.itheima.data_strean;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamTest2 {
    public static void main(String[] args){
        try (
                DataInputStream dis = new DataInputStream(new FileInputStream("helloworld-app\\src\\itheimaDatastream.txt"))
        ) {
            //顺序必须一一对应
            int i = dis.readInt();
            System.out.println(i);

            double d = dis.readDouble();
            System.out.println(d);

            Boolean b = dis.readBoolean();
            System.out.println(b);

            String rs = dis.readUTF();
            System.out.println(rs);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
