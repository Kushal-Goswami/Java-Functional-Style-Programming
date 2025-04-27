package org.example.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedExample1 {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(4,2,8,7,3,5,9,6,1); //Source

        // Sort numbers in Ascending order

       List<Integer>sortedNumbersASC= numbers.stream().sorted()
                .toList();

        System.out.println(sortedNumbersASC); // Natural order

        // Sort numbers in Decending order

        List<Integer>sortedNumbersDSC= numbers.stream().sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedNumbersDSC);


    }
}
