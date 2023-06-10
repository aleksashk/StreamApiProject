package com.philimonov.java8.lambda;

import com.philimonov.java8.functionalInterface.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//        System.out.println(names);
//
//        Collections.sort(names, (a, b) -> b.compareTo(a));
//        System.out.println(names);

        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from);
        System.out.println(stringConverter.convert(2));
    }

    class Lambda4 {
        static int outerStaticNum;
        int outerNum;

        void testScopes() {
            Converter<Integer, String> stringConverter1 = (from) -> {
                outerNum = 23;
                return String.valueOf(from);
            };
            Converter<Integer, String> stringConverter2 = (from) -> {
                outerStaticNum = 72;
                return String.valueOf(from);
            };
        }
    }
}
