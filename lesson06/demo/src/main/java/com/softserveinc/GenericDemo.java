package com.softserveinc;

import java.util.Arrays;

public class GenericDemo {
    public static void main(String[] args) {
        //demo01();
        Tea tea = new Tea("Sri Lanka", 100);
        Box<Tea> teaBox = new Box<>(tea);
        //teaBox.setValue("Is it tea?");
        teaBox.setValue(new Tea("Georgia", 150));
        drink(teaBox);

        Box objBox = new Box("test");
        System.out.println(objBox.getValue());

        printBox(teaBox);
        
        String[] strArr = new String[5];
        fillArray(strArr, "hello");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        Box<Tea>[] boxes = new Box[10]; // !!
    }
    
    private static <T> void fillArray(T[] arr, T item) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = item;
        }
    }

    private static void printBox(Box<?> box) {
        System.out.println("box.getValue() = " + box.getValue());
    }

    private static void drink(Box<Tea> box) {
        //Object value = box.getValue();
        //if(value instanceof Tea) {
            //Tea tea = (Tea) value; // downcasting
        Tea tea = box.getValue();
        System.out.println("Drink " + tea.getName());
        //} else {
        //    System.err.println("value is not Tea");
        //}
    }

    private static void demo01() {
        Tea tea = new Tea(null, 0);
        Object o = tea;
        print(tea);
        String str = "Hello";
        o = str;
        print(str);
        Object[] arr = new Object[3];
        arr[0] = tea;
        arr[2] = str;
    }

    static void print(Object obj) {
        System.out.println(obj);
    }
}

class Tea {
    private String name;
    private int weight;

    public Tea(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Coffee {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Pair<K, V> {
    private K key;
    private V value;
}

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
