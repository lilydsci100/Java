package com.itheima.buffered_stream.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new FileReader("helloworld-app\\src\\ieheima06.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("helloworld-app\\src\\ieheima06new.txt"))
                ){
            List<String> list = new ArrayList<>();

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
//              list.add(br.readLine()); //会跳过一行，不行,所以要提前定义一个String line
                list.add(line);
            }

            Collections.sort(list);
            System.out.println(list);

            for(String s: list) {
                bw.write(s);
                bw.newLine();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
