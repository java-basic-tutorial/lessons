package com.softserveinc;

import java.util.Arrays;

public class InheritanceDemo {
    public static void main(String[] args) {
//        System.out.println("PI: " + Math.PI);
//        System.out.printf("%.1f %25s %d%n", Math.PI, "Hello Word", 10);
        Animal animal;// = new Animal("Dog", true);
        Cat barsik = new Cat("Барсик");
        Cat bomg = new Cat();
        System.out.println(barsik.getName());
        System.out.println(bomg.getName());
        animal = barsik; // upcasting

        barsik = (Cat) animal; // downcasting
        animal = new Dog();

        if(animal instanceof Cat) {
            barsik = (Cat) animal;
            System.out.println("barsik = " + barsik.getName());
        } else {
            System.out.println("animal is not Cat");
        }
        int i = 10;
        double d = i; // casting
        i = (int)d;
        System.out.println("barsik.getKind() = " + barsik.getKind());

        Zoo zoo = new Zoo();
        zoo.addAnimal(barsik);
        zoo.addAnimal(new Dog());
    }
}

class Zoo {
    private Animal[] animals;

    public Zoo() {
        animals = new Animal[0];
    }

    public void addAnimal(Animal animal) {
        animals = Arrays.copyOf(animals, animals.length);
        animals[animals.length - 1] = animal;
    }
}

class Dog extends Animal{

    public Dog() {
        super("Dog", true);
    }

    public void bark(){
        System.out.println("Bark Bark");
    }

    @Override
    public void say() {
        bark();
    }
}

class Cat extends Animal {
    private String name;

    public Cat() {
        //super("Cat", true);
        //this.name = "Бездомный бродячий котик";
        this("Бездомный бродячий котик");
    }

    public Cat(String name) {
        super("Cat", true);
        this.name = name;
        //this.isMammal = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public void say() {
        System.out.println("Mau");
    }

    @Override
    public String getKind(){
        return "TEST";
    }
}

abstract class Animal {
    private final String kind;
    protected boolean isMammal;

    public Animal(String kind, boolean isMammal) {
        this.kind = kind;
        this.isMammal = isMammal;
    }

    public abstract void say();

    public String getKind() {
        return kind;
    }

//    public void setKind(String kind) {
//        this.kind = kind;
//    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
