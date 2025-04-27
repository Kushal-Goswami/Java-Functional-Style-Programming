package org.example.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedExample2 {
    public static void main(String[] args) {

        List<String> strings= Arrays.asList("Guava", "Apple", "Mango", "Cherry","Orange", "Banana");

        // Sort strings in alphabetical or ascending order

        List<String>resultASC=strings.stream().sorted()
                .toList();

        System.out.println(resultASC); // Alphabetical order

        // Sort strings in descending order

        List<String>resultDSC= strings.stream().sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(resultDSC);

    }
}
