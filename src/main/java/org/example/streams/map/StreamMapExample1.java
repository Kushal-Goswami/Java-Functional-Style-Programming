package org.example.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample1 {
    public static void main(String[] args) {

        List<String>fruits= Arrays.asList("Apple", "Banana", "Guava", "Mango");

        List<String> mappedFruits=fruits.stream()
                .peek(elements -> System.out.println("Before map() "+ elements))
                .map(elements -> elements.toUpperCase())
                .peek(elements -> System.out.println("After map() "+ elements))
                .toList();
        System.out.println(mappedFruits);
    }
}
