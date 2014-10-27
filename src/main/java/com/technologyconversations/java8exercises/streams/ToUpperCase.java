package com.technologyconversations.java8exercises.streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ToUpperCase {

    public static List<String> transform(List<String> collection) {
        return collection.stream() // Convert collection to Stream
                .map(element -> element.toUpperCase()) // Convert each element to upper case
                .collect(toList()); // Collect results to a new list
    }

}
