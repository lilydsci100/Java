package com.itheima.inheritance.constructor;
//子类构造器调用父类构造器的常见应用场景
public class test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("lily", 19, "Java");
        System.out.println(t.getSkill());
        System.out.println(t.getAge());
        System.out.println(t.getName());
    }
}

class Teacher extends People{
    private String skill;

    public Teacher(String name, int age, String skill) {
        super(name, age); //highlight 很重要super！不能使用this.name = name
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class People {
    private String name;
    private int age;

    public People() {}

    public People(String name, int age) {
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
}
