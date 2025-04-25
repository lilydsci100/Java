package com.itheima4.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test3Field {
    @Test
    public void testGetFields() throws Exception {
        //1.反射第一步: 必须先得到这个类的Class对象
        Class c = Cat.class;

        //2.获取类的全部变量
        Field[] fields = c.getDeclaredFields();

        //3.遍历这个成员变量数组
        for (Field field : fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }

        //4.定位某个成员变量
        Field fName = c.getDeclaredField("name"); //变量名字
        System.out.println(fName.getName() + "--->" + fName.getType());

        Field fAge = c.getDeclaredField("age");
        System.out.println(fAge.getName() + "--->" + fAge.getType());

        //field方法的作用
        //赋值
        Cat cat = new Cat();
        fName.setAccessible(true); //禁止访问控制权限
        fName.set(cat, "加菲猫"); //为实例成员cat的成员变量name设置特定数值
        System.out.println(cat);

        //取值
        String name = (String) fName.get(cat); //取得实例变量cat的成员变量name的数值 强转
        System.out.println(name);
    }
}
