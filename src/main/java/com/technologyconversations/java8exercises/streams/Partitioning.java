package com.technologyconversations.java8exercises.streams;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Partitioning {

    private Partitioning() {
    }

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream() // Convert collection to Stream
                .collect(partitioningBy(p -> p.getAge() >= 18)); // Partition stream of people into adults (age => 18) and kids
    }

}
