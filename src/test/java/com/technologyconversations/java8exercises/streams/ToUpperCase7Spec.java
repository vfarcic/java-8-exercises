package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static com.technologyconversations.java8exercises.streams.ToUpperCase7.*;
import java.util.Arrays;
import java.util.List;

public class ToUpperCase7Spec {

    @Test
    public void toUpperCaseShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
        List<String> expected = Arrays.asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}
