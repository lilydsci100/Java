package com.itheima.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class array {
    public static void main(String[] args) {
        //定义数组
        int[] arr1 = new int[]{11,12,13,14,15};
        int[] arr2 = {11,12,13,14,15};
        int[] arr4 = new int[10]; //定义动态数组,长度为10
        System.out.println(arr2);//output is the address of array

        //Arrays advance
        //copyOf(类型[] arr, int newLength): 拷贝数组可以指定新数组的长度
        int[] arr3 = Arrays.copyOf(arr1,10);
        System.out.println(Arrays.toString(arr3));

        //public static setAll(double[] array, IntToDoubleFunction generator): 把数据中的原数据经过处理改为新数据又存进去
        double[] prices = {99.8, 128, 100};

        Arrays.setAll(prices, new IntToDoubleFunction() { //匿名内部类
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));
        //数组中的都是对象时
        Student[] students = new Student[4];
        students[0] = new Student("lily", 160.3, 21);
        students[1] = new Student("Amy", 150.3, 19);
        students[2] = new Student("Tom", 187.3, 21);
        students[3] = new Student("Dough", 192.3, 20);

        //1.在类中implement Comparable接口 并重写compareTo方法 再调用sort方法
        Arrays.sort(students); //按照年龄升序
        System.out.println(Arrays.toString(students));
        //2. 使用sort方法，创建comparator比较器接口中的匿名内部类对象
        Arrays.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());//升序
                //return Double.compare(o2.getHeight(), o1.getHeight()); //降序
            }
        });
    }
}
