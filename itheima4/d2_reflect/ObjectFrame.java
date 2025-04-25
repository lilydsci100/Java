package com.itheima4.d2_reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {
    //保存任意对象的字段和其数据到文件中去
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("src\\com\\itheima4\\d2_reflect\\Test5Frame.txt", true));
        //obj是任意对象, 到底有多少个字段要保存
        Class c = obj.getClass();
        ps.println("-----------" + c.getSimpleName() + "-----------");
        //2. 从这个类中提取他的全部成员变量
        Field[] fields = c.getDeclaredFields();
        //3.遍历每个成员变量
        for (Field field : fields) {
            field.setAccessible(true); //禁止访问控制
            //4.拿到成员变量的名字
            String name = field.getName();
            //5.拿到成员变量的数值
            String value = field.get(obj) + "";
            ps.println(name + "=" + value);
        }
        ps.close();
    }
}
