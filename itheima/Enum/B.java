package com.itheima.Enum;
//抽象枚举
public enum B {
    //罗列对象
    X(){ //调无参构造器
       @Override
       public void go(){};
    }, Y("lily") { //调有参构造器
        @Override
        public void go(){
            System.out.println(getName() + " is running.");
        };
    };

    //构造器私有
    B() {
    }

    B(String name) {
        this.name = name;
    }

    private String name;
    public abstract void go();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
