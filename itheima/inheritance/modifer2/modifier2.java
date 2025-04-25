package com.itheima.inheritance.modifer2;

import com.itheima.inheritance.modifer.modifier;

public class modifier2 extends modifier {
    //任意包下的子类里（extend）
    public void test() {
        // privateMethod(); //error
        // method(); //error
        protectedMethod();
        publicMethod();
    }
}
