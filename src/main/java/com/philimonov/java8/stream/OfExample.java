package com.philimonov.java8.stream;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class OfExample {
    public static void main(String[] args) {
        Stream.of(1, 3, 5, 6, 67)
                .forEach(System.out::println);
        System.out.println("-------------------------");
        Set.of(1, 6, 7)
                .forEach(System.out::println);
        System.out.println("-------------------------");
        Map.of("first", 1, "second", 2)
                .forEach((k, v) -> System.out.println("key: " + k + " , value: " + v));

    }
}
