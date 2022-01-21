package com.softserveinc;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> engRuDictionary = new HashMap<>();
        engRuDictionary.put("hello", "привет");
        engRuDictionary.put("help", "помоги");
        System.out.println(engRuDictionary);
        System.out.println("engRuDictionary.get(\"hello\") = " +
                engRuDictionary.get("hello"));
        System.out.println("engRuDictionary.keySet() = " + engRuDictionary.keySet());
        System.out.println("engRuDictionary.values() = " + engRuDictionary.values());
    }
}
