package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;

import static com.technologyconversations.java8exercises.streams.Sum.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Sum all elements of a collection
 */
public class SumSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
