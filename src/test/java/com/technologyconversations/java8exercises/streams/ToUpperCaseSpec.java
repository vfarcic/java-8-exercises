package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.technologyconversations.java8exercises.streams.ToUpperCase.transform;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ToUpperCaseSpec {

    @Test
    public void toUpperCaseShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}
