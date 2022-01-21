package com.softserveinc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        System.out.println("list = " + list);
        list.add(10);
        System.out.println("list = " + list);
        list.add(0, 5);
        System.out.println("list = " + list);
        list.remove(new Integer(5));
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println("list = " + list);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.stream().distinct().collect(Collectors.toList()) = " + list.stream().distinct().collect(Collectors.toList()));
    }
}
