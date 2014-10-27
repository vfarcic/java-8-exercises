package com.technologyconversations.java8exercises.streams;

import java.util.ArrayList;
import java.util.List;

public class ToUpperCase7 {

    public static List<String> transform(List<String> collection) {
        List<String> upperCaseList = new ArrayList<>();
        for (String element : collection) {
            upperCaseList.add(element.toUpperCase());
        }
        return upperCaseList;
    }

}
