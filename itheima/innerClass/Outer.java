package com.itheima.innerClass;

public class Outer {
    private int age = 99;
    public static String a;
    public static String schoolName;
    //成员内部类
    public class Inner {
        private String name;
        public static String schoolName;
        private int age = 88;

        public void test(){
            //可直接访问外部类的静态成员
            System.out.println(a);
            //访问当前外部类对象
            int age = 66;
            System.out.println(age); //print 66
            System.out.println(this.age); //print 88
            System.out.println(Outer.this.age); //print 99, 访问当前外部类实例对象
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    };
    //静态内部类
    public static class Inner2 {
        private String name; //实例变量
        public static int a; //静态变量

        public void test(){
            System.out.println(schoolName); //可直接访问外部类的静态变量
            // System.out.println(age); 不可访问外部类的实例变量
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
