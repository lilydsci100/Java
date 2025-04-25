package com.itheima.generics._class;

import com.itheima.Abstract.Animal;
import com.itheima.Abstract.Dog;

public class Test {
    public static void main(String[] args) {
        //泛型定义（单个）
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        String element = arrayList.get(1);
        System.out.println(element);
        //两个泛型
        MyArrayList2<String, String> arrayList2 = new MyArrayList2<>();
        //继承 public class MyArrayList3<E extends Animal>
        MyArrayList3<Animal> arrayList3 = new MyArrayList3<>();
        MyArrayList3<Dog> arrayList4 = new MyArrayList3<>();
    }
}
