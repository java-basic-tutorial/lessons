package com.softserveinc;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(null);
//        System.out.println("set = " + set);
//        set.add(10);
//        System.out.println("set = " + set);
//        set.add(10);
//        System.out.println("set = " + set);
//        set.add(10);
//        System.out.println("set = " + set);
        Set<Cat> catSet = new TreeSet<>();
        catSet.add(new Cat("Barsik"));
        catSet.add(new Cat("Barsik"));
        catSet.add(new Cat("Ashot"));
        catSet.add(new Cat("Murka"));
        catSet.add(new Cat("Murka"));
        System.out.println("catSet = " + catSet);
        catSet.remove(new Cat("Barsik"));
        System.out.println("catSet = " + catSet);
    }
}

class Cat implements Comparable<Cat> {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.name);
    }
}
