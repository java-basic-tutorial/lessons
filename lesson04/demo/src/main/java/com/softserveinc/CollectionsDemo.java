package com.softserveinc;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // Wolf[] wolves
        List<Wolf> wolves = new ArrayList<>();
        wolves.add(new Wolf("Green"));
        wolves.add(new Wolf("Black"));
        wolves.add(new Wolf("Black"));
        wolves.add(new Wolf("White"));
        wolves.add(new Wolf("White"));
        for (int i = 0; i < wolves.size(); i++) {
            System.out.println(wolves.get(i));
        }
        System.out.println(wolves);

        Set<Wolf> set = new HashSet<>();
        set.add(new Wolf("Green"));
        set.add(new Wolf("Black"));
        set.add(new Wolf("Black"));
        set.add(new Wolf("White"));
        set.add(new Wolf("White"));
        for(Wolf wolf: set) {
            System.out.println(wolf);
        }
        System.out.println(set);
    }
}

class Zoo2 {
    private Set<Animal> animals;
}

class Wolf {
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(name, wolf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                '}';
    }
}
