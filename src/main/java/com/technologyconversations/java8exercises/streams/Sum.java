package com.technologyconversations.java8exercises.streams;

import java.util.List;

public class Sum {

    public static int calculate7(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate(List<Integer> people) {
        return people.stream() // Convert collection to Stream
                .reduce(0, (total, number) -> total + number); // Sums elements with 0 as starting value
    }

}
