package com.itheima.inheritance.constructor;
//子类构造器的特点: 子类的全部构造器(有参/无参)，都会先调用父类的构造器（无参），再执行自己；
class F2 {
    public F2(String x, int age) {
        System.out.println("F的有参构造器，有两个参数");
    };
}

class Z2 extends F2 {
    public Z2() {
        super("lily", 4); //必须有 highlight
        System.out.println("Z的无参构造器");
    }
    public Z2(String x) {
        super("lily", 4); //必须有 highlight
        System.out.println("Z的有参构造器");
    }
}
public class test2 {
    public static void main(String[] args) {
        Z2 z = new Z2();
        Z2 z1 = new Z2("lily");
    }
}
