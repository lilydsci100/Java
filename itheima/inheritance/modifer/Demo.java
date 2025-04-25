package com.itheima.inheritance.modifer;

public class Demo {
    public static void main(String[] args) {
        modifier f = new modifier();
        //同一包下的其他类里
        // f.privateMethod(); //error
        f.protectedMethod();
        f.method();
        f.publicMethod();
    }
}
