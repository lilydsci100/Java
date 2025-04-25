package com.itheima4.d2_reflect;

public class Cat {
    private static int a;
    public static final String COUNTRY = "China";

    private String name;
    private int age;

    public Cat(){}

    private Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void run() {}

    public void eat() {
        System.out.println(" cat is eating");
    }

    private String eat(String name) {
        return "cat likes eating " + name;
    }
}
