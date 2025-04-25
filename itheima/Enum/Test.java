package com.itheima.Enum;

public class Test {
    public static void main(String[] args) {
        //枚举第一行都是常量，记住的是枚举类的对象
        A a2 = A.Y;
        System.out.println(a2);

        A[] as = A.values(); //获取全部对象
        A a3 = A.valueOf("Y"); //获取对象的值
        System.out.println(a3); //Y
        System.out.println(a3.ordinal());//2 the index of Y
    }
}
