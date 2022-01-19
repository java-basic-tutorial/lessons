package com.softserveinc;

import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("MathOperation.PI = " + MathOperation.PI);
        MathOperation mathOperation = new AddOperation();
        System.out.println(mathOperation.action(6, 2));
        mathOperation = new SubstractOperation();
        System.out.println(mathOperation.action(6, 2));
        mathOperation = (a, b) -> a * b; // lambda
        System.out.println(mathOperation.action(6, 2));

        Comparator<Integer> cmp = (a, b) -> b - a;
        Predicate<Integer> predicate = a -> a % 2 == 0;
        Predicate<String> stringPredicate = str -> str.equals("qwerty");
    }
}

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer a) {
        return a % 2 == 0;
    }
}

@FunctionalInterface
interface MathOperation {
    double PI = 3.14;
    int action(int a, int b);
}

class AddOperation implements MathOperation {
    @Override
    public int action(int a, int b) {
        return a + b;
    }
}

class SubstractOperation implements MathOperation {

    @Override
    public int action(int a, int b) {
        return a - b;
    }
}
