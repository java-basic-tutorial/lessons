package com.softsorveinc;

import java.util.Arrays;

public class Lesson03 {

    static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    static void print(int[] arr) { // define method
        System.out.println("arr.length = " + arr.length);
    }

    /*static double avg(double a, double b) {
        return (a + b)/2;
    }

    static double avg(int c, int d) {
        return (d + c)/2;
    }

    static double avg(double a, double b, double c) { // overload
        return (a + b + c)/3;
    }*/

    static double avg(double... arr) {
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        return avg / arr.length;
    }

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main(String[] args) {
//        int a = 10, b = 20;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        swap(a, b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        int[] arr = {a, b};
//        System.out.println(Arrays.toString(arr));
//        swap(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int water = 300;
//        int milk = 150;
//        int coffee = 30;
//        {
//            int count = Lesson03.min(water / 200, milk / 50); // invoke method
//            System.out.println("count = " + count);
//        }
//        print(new int[]{1, 2, 3, 4});
//        System.out.println("avg(5) = " + avg(5));
//        System.out.println("avg(5.0, 7.0) = " + avg(5.0, 7.0));
//        System.out.println("avg(5, 7, 8) = " + avg(5, 7, 8));
//        System.out.println("avg(5, 7, 8) = " + avg(5, 7, 8, 9));
        String name;
        name = "Test";
        Cat murka = new Cat("Murka", 1, "White");
        //murka.setName("Murka");
        System.out.println("murka.name = " + murka.getName());
        Cat barsik = new Cat("Barsik", 2, "Gray");
        //barsik.setName("Barsik"); // barsik.name = "..."
        System.out.println("barsik.name = " + barsik.getName());
        setName(murka);
        System.out.println("murka.name = " + murka.getName());
        Cat cat = new Cat();
        Cat cat2 = new Cat("Vasjka", 1, "Black");
        System.out.println("cat2 = " + cat2);

        Cat[] cats = new Cat[2];
        cats[0] = barsik;
        cats[1] = murka;

        cats = Arrays.copyOf(cats, cats.length + 1);
        cats[2] = new Cat("", 1, "");
    }

    static void setName(Cat cat) {
        cat.setName("Dog");
    }
}

class Cat {
    private String name; // field
    private int age;
    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) { // setter
        this.name = name;
    }

    public String getName() { // getter
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}