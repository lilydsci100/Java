package com.itheima.generics._class;

public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int size;

    public boolean add(E e) {
        arr[size++] = e;
        return true;
    }
    public E get(int index) {
        return (E) arr[index]; //强转类型
    }
}
