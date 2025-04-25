package com.itheima.inheritance.modifer2;

import com.itheima.inheritance.modifer.modifier;

public class Demo2 {
    //任意包下的任意类里
    public static void main(String[] args) {
        modifier m = new modifier();
        // m.privateMethod(); //error
        // m.method(); //error
        // m.protectedMethod(); //error
        m.publicMethod();
    }
}
