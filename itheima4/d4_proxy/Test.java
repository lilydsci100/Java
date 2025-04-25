package com.itheima4.d4_proxy;

public class Test {
    public static void main(String[] args) {
        BigStar s = new BigStar("Lisa");
        Star starProxy = ProxyUtil.createProxy(s);

        String rs = starProxy.sing("好日子");
        System.out.println(rs);

        String rd = starProxy.dance();

    }
}
