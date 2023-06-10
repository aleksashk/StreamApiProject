package com.philimonov.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println(names);

        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);
    }
}
