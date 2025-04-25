package com.itheima.array;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    public Student() {
    }
    public Student(String name, double height, int age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", height=" + height + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
