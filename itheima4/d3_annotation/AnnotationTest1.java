package com.itheima4.d3_annotation;

@MyTest1(aaa="lily",ccc = {"123", "456"})
@MyTest2("Sam")
public class AnnotationTest1 {
    @MyTest1(aaa="Rally", bbb =false, ccc = {"678","789"})
    public void test1(){}
}
