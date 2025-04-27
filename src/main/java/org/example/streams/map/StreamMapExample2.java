package org.example.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample2 {
    public static void main(String[] args) {

        List<String> listOfStrings= Arrays.asList("1", "2", "3", "4", "5");

        List<Integer>listOfIntegers=listOfStrings.stream().map(elements -> Integer.valueOf(elements))
                .toList();
        System.out.println(listOfIntegers);
    }
}
