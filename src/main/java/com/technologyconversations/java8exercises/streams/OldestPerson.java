package com.technologyconversations.java8exercises.streams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream() // Convert collection to Stream
                .max(Comparator.comparing(Person::getAge)) // Compares people ages
                .get(); // Gets stream result
    }

}
