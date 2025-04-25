package com.itheima4.d2_reflect;

public class Test1Class {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        System.out.println(c1.getName()); //全类名
        System.out.println(c1.getSimpleName()); //简名: Student

        Class c2 = Class.forName("com.itheima.d2_refelct.Student"); //输入全类名
        System.out.println(c1 == c2);

        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);
    }
}
