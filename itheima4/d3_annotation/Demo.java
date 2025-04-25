package com.itheima4.d3_annotation;

@MyTest4(value = "lily", aaa = 99.4, bbb = {"sam", "time"})
public class Demo {
    @MyTest4(value = "Rally", aaa = 199.8, bbb = {"rachel", "tie"})
    public void test1(){}
}
