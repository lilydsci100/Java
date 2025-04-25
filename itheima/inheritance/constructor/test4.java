package com.itheima.inheritance.constructor;
//this调用兄弟构造器
public class test4 {
    public static void main(String[] args) {
        Student s1 = new Student("lily",18,"SFU");
        Student s2 = new Student("Tim",18);

        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchoolName());
    }
}

class Student{
    private String name;
    private int age;
    private String schoolName = "UBC";

    public Student() {};
    public Student(String name, int age) {
        this(name,age,"UBC"); // highlight! this调用兄弟构造器Student(String name, int age, String schoolName)，默认schooName值为UBC;
        //this 不可与 super同用
    }
    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
