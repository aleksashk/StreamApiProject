package com.philimonov.java8.functionalInterface;

public class Starter {
    public static void main(String[] args) {
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
