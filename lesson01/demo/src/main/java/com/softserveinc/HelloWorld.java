package com.softserveinc;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) { // psvm
//        System.out.println("Hello World"); // sout
//
        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String name =  scanner.nextLine();
//        System.out.println("Hello " + name);
//
//        int age;
//        age = 10;
//        System.out.println("age = " + age); // soutv
//
//        int $int;
//        int _10;

        byte b = 10;
        System.out.println("b = " + b);
        int i = b;
        System.out.println("i = " + i);
        i = 256;
        b = (byte)i;
        System.out.println("b = " + b);

        //int age = scanner.nextInt();

        int year = 2021;
        System.out.println("year = " + year);
        year++;// year = year + 1;
        System.out.println("New year " + year);
        year--;
        System.out.println("Previous year " + year);

        int age = 22;
        boolean yes = age > 18;
        //System.out.println("yes = " + yes);
        if(age >= 18) {
            System.out.println("Welcome");
        } else {
            System.out.println("Go home");
        }

        int val = (3+3)*2;
        System.out.println("val = " + val);
    }
}
