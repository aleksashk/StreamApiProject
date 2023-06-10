package com.philimonov.java8.functionalInterface;

public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
