package com.philimonov.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println(names);

        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
        System.out.println(names);
    }
}
