package com.technologyconversations.java8exercises.streams;

public class Person {

    public Person(final String nameValue, final int ageValue) {
        name = nameValue;
        age = ageValue;
    }

    private String name;
    public String getName() {
        return name;
    }

    private int age;
    public int getAge() {
        return age;
    }

}