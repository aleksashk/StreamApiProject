package com.philimonov.java8.stream;

import java.util.List;
import java.util.Objects;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted((leftSt, rightSt) -> Integer.compare(rightSt.getScore(), leftSt.getScore()))
                .takeWhile(student -> student.getScore() > bound)
                .toList();
    }
}
