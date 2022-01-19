package com.softserveinc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Cat> catStream = Stream.of(new Cat("Merka"), new Cat("Barsik"), new Cat("Vaska"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Pirogok"));
        cats.add(new Cat("Bobik"));
        cats.add(new Cat("Murka"));
        Stream<Cat> stream = cats.stream();

        Optional<Cat> first = catStream.findFirst();
        if(first.isPresent()) {
            System.out.println(first.get());
        }

        List<Integer> collect = integerStream
                .filter(num -> num % 2 == 0)
                .peek(num -> System.out.println(num)) // промежуточній
                .sorted((a, b) -> b - a)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(collect);
        long count = collect.stream().count();
        System.out.println("count = " + count);
        OptionalDouble average = collect.stream().mapToInt(Integer::intValue).average();
        if(average.isPresent()) {
            System.out.println(average.getAsDouble());
        }

        Random random = new Random();
        IntStream ints = random.ints(100);
        OptionalInt min = ints.peek(System.out::println).min();
//        ints.forEach(System.out::println);
        System.out.println("min.getAsInt() = " + min.getAsInt());

    }
}

class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
