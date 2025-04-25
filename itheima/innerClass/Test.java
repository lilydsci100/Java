package com.itheima.innerClass;

public class Test {
    public static void main(String[] args) {
        //成员内部类
        Outer.Inner in = new Outer().new Inner();
        //静态内部类
        Outer.Inner2 in2 = new Outer.Inner2();
        in.test();

        //匿名内部类
        //定义并创建了一个狗类
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("dog swim");
            }
        };
        go(s1);
        //匿名内部类作为参数传输给方法
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("cat swim");
            }
        });
    };
    public static void go(Swimming s) {
        System.out.println("Start");
        s.swim();
    }

};


interface Swimming{
    void swim();
}



