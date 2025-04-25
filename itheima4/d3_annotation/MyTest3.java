package com.itheima4.d3_annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) //当前修饰的注释只能是类和方法
@Retention(RetentionPolicy.RUNTIME) //控制下面的注释一直保存到运行时
public @interface MyTest3 {
}
