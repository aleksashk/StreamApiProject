package com.philimonov.java8.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(28, "Mary"));
        input.add(new Student(228, "Paul"));

        List<Student> expected = List.of(new Student(228, "Paul"), new Student(28, "Mary"));
        assertThat(StudentLevel.levelOf(input, 20)).containsSequence(expected);
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 20)).containsAll(expected);
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Paul"));
        List<Student> expected = List.of(new Student(28, "Paul"));
        assertThat(StudentLevel.levelOf(input, 20)).containsAll(expected);
    }
}
