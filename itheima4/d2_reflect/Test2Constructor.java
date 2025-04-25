package com.itheima4.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test2Constructor {
    @Test
    public void testGetConstructors() {
        //1.反射第一步: 必须先得到这个类的Class对象
        Class c = Cat.class;
        //2.获取类的全部构造器
        //Constructor[] cs = c.getConstructors(); //不太好, 只能获取public修饰的构造器
        Constructor[] cs = c.getDeclaredConstructors(); //获取全部构造器(只要存在就能拿到)
        //3.遍历数组中的每个构造器对象
        for (Constructor constructor: cs) {
            System.out.println(constructor.getName() + "--->" + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        //1.反射第一步: 必须先得到这个类的Class对象
        Class c = Cat.class;

        //2.获取某个构造器: 无参数构造器
        //Constructor constructor = c.getConstructor(); //获取某个构造器 不太好, 只能获取public修饰的构造器
        Constructor constructor1 = c.getDeclaredConstructor();
        System.out.println(constructor1.getName() + "--->" + constructor1.getParameterCount());

        //初始化对象
        constructor1.setAccessible(true);//禁止检查访问权限
        Cat cat = (Cat) constructor1.newInstance();
        System.out.println(cat);

        //3.获取有参构造器
        Constructor constructor2 = c.getDeclaredConstructor(String.class, int.class); //String.class代表string类型
        System.out.println(constructor2.getName() + "--->" + constructor2.getParameterCount());

        //构造器方法的作用
        //初始化对象
        constructor2.setAccessible(true);//禁止检查访问权限, 没有这一行会报错因为有参构造器是private
        Cat cat2 = (Cat) constructor2.newInstance("Hello", 3); //强转
        System.out.println(cat2);
    }
}
