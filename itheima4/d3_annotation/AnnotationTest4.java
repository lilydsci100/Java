package com.itheima4.d3_annotation;

import java.lang.reflect.Method;

/*
    注解的应用场景: 模拟Junit框架的设计
    有MyTest注解的方法运行, 没有的就不运行
 */
public class AnnotationTest4 {
    @MyTest
    public void test1(){
        System.out.println("test1");
    }

    //@MyTest
    public void test2(){
        System.out.println("test2");
    }

    @MyTest
    public void test3(){
        System.out.println("test3");
    }

    //@MyTest
    public void test4(){
        System.out.println("test4");
    }

    //也可把main分离到另外一个class里边去
    public static void main(String[] args) throws Exception {
        //假设我们现在有一个AnnotationTest4的实例对象
        AnnotationTest4 a = new AnnotationTest4();
        //得到class对象
        Class c = a.getClass();
        //提取这个类中的全部成员方法
        Method[] methods = c.getDeclaredMethods();
        //遍历这个数组中的每个方法
        for (Method method : methods) {
            //判断该方法上面是否有@MyTest
            if (method.isAnnotationPresent(MyTest.class)) {
                //该方法有@MyTest
                method.setAccessible(true);
                method.invoke(a);
            }
        }
    }
}
