package com.itheima3.d1_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        //1.获取本机IP地址对象的
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostAddress());
        System.out.println(ip1.getHostName());

        //2.获取指定IP或者域名的IP地址对象
        InetAddress ip2 = InetAddress.getByName("www.google.com");
        System.out.println(ip2.getHostAddress());
        System.out.println(ip2.getHostName());

        //ping www.google.com
        System.out.println(ip2.isReachable(6000));
    }
}
