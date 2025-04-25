package com.itheima.inheritance.modifer;

public class modifier {
    //
    private void privateMethod() {
        System.out.println("private method");
    }

    void method() {
        System.out.println("method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    public void publicMethod() {
        System.out.println("public method");
    }

    //在本类中
    public void test() {
        privateMethod();
        method();
        protectedMethod();
        protectedMethod();
    }
}
