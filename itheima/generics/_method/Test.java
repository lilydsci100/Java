package com.itheima.generics._method;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        //泛型方法基础运用
        String rs = test("java");
        System.out.println(rs);

        Dog d = test(new Dog());
        System.out.println(d);

        //泛型方法拓展
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new BMW());
        carArrayList.add(new BENZ());
        carArrayList.add(new Car());
        go(carArrayList);

        ArrayList<BMW> bmwArrayList = new ArrayList<>();
        bmwArrayList.add(new BMW());
        bmwArrayList.add(new BMW());
        // go(bmwArrayList); //报错因为ArrayList<Car>和ArrayList<BMW>没关系，即使BMW extends Car
        go1(bmwArrayList); //有缺陷，Dog也能调用go1，但我们希望只有Cars及其子类调用go1
        go2(bmwArrayList); //可以但是有点繁琐
        go3(bmwArrayList); //最优版


        ArrayList<BENZ> benzArrayList = new ArrayList<>();
        benzArrayList.add(new BENZ());
        benzArrayList.add(new BENZ());
        // go(benzArrayList); //报错因为ArrayList<Car>和ArrayList<BENZ>没关系，即使BENZ extends Car
        go1(benzArrayList);
        go2(benzArrayList);
        go3(bmwArrayList); //最优版

        ArrayList<Dog> dogArrayList = new ArrayList<>();
        dogArrayList.add(new Dog());
        dogArrayList.add(new Dog());
        go1(dogArrayList);
    }

    //泛型方法
    public static <T> T test(T t) {
        return t;
    }

    public static void go(ArrayList<Car> cars) {}


    public static <T> void go1(ArrayList<T> cars){}

    public static <T extends Car> void go2(ArrayList<T> cars){}//已经判定T的类型必须extends Car

    //? 通配符，使用泛型的时候可以代表一切类型
    public static void go3(ArrayList<? extends Car> cars) {}

    //
}
