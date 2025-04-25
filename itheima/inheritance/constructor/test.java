package com.itheima.inheritance.constructor;
//子类构造器的特点: 子类的全部构造器(有参/无参)，都会先调用父类的构造器（无参），再执行自己；
class F {
    public F() {
        System.out.println("F的无参构造器");
    }
}

class Z extends F {
    public Z() {
        System.out.println("Z的无参构造器");
    }
    public Z(String x) {
        System.out.println("Z的有参构造器");
    }
}
public class test {
    public static void main(String[] args) {
        Z z = new Z();
        Z z1 = new Z("lily");
    }
}
