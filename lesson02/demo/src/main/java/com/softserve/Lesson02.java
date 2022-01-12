package com.softserve;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {
        int hour = LocalDateTime.now().getHour();
        if (hour >= 9 && hour <= 18) {
            System.out.println("Work time");
        } else {
            System.out.println("My time");
        }

        if (hour < 9 || hour > 18) {
            System.out.println("My time");
        }

        final int month = LocalDate.now().getMonthValue();
        /*if(month == 1) {
            System.out.println("Jan");
        } else if(month == 2) {
            System.out.println("Feb");
        } else if(month == 3) {
            System.out.println("Mar");
        }*/
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            default:
                System.out.println("Other moths");
                break;
        }
        char key = 'A';
        switch (key) {
            case 'A':
            case '<':
                System.out.println("Move left");
                break;
        }

        int i = 0;
        while (i < 10) {
            System.out.print(i + "\n");
            i++;
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        /*int age;
        do {
            System.out.print("What is your age? ");
            age = scanner.nextInt();
        } while (age < 0 || age > 150);
        System.out.println("You born on " + (LocalDate.now().getYear() - age));*/
        for (int j = 10; j > 0; j--) {
            System.out.print(j);
        }
        System.out.println();
        System.out.println("Break");
        i = 0;
        label:
        while (true) {
            i++;
            if(i == 5) {
                break label;
            }
            System.out.println("i = " + i);
        }

        System.out.println("Continue");
        for (int j = 0; j < 10; j++) {
            if(j % 2 == 0) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();

        int num = 0;
        System.out.println("num = " + num);
        int[] arr = new int[12];
        System.out.println(Arrays.toString(arr));

        String[] catNames = {"Tom", "Bob"};
        for (int j = 0; j < catNames.length; j++) {
            System.out.println(catNames[j]);
        }
        for (String name: catNames) {
            System.out.println(name);
        }
        String[] copy = Arrays.copyOf(catNames, catNames.length);
        //copy = catNames;
        copy[0] = "Murka";
        System.out.println(Arrays.toString(catNames));
        System.out.println(Arrays.toString(copy));

//        String password = "qwerty";
//        System.out.print("Your password: ");
//        String psv = scanner.nextLine();
//        if(password.equals(psv)) {
//            System.out.println("Welcome to secret page");
//        } else {
//            System.out.println("Access denied");
//        }

        double a = 3.1429393;
        System.out.printf(Locale.ENGLISH, "a = %.2f\n", a);
    }
}
