package com.itheima.Enum;

public enum A {
    //枚举第一行罗列的是枚举对象的名字
    X,Y,Z;
    //枚举构造器私有

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
