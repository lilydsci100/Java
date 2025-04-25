package com.itheima4.d4_proxy;

public class BigStar implements Star { //约定必须implement interface
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(String name){
        System.out.println(this.name + " is singing " + name);
        return "Thank you!";
    }

    public String dance(){
        System.out.println(this.name + "正在跳舞");
        return null;
    }
}
