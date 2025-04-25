package com.itheima4.d3_annotation;

public @interface MyTest1 {
    String aaa();
    boolean bbb() default false;
    String[] ccc();
}
