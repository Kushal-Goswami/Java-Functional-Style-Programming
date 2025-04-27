package org.example.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilterMethodExample1 {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10); //Source

        //Traditional way to print the even numbers from the List

        List<Integer> evenNumbers=new ArrayList<>();
        for (Integer number:numbers)
        {
            if (number % 2==0)
            {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);

        // Using Stream API's filter() method to print even numbers from the List

//        Stream<Integer> streamNumbers = numbers.stream();

//        List<Integer> streamEvenNumbers=streamNumbers.filter(nums -> nums % 2 ==0)
//                .toList();

        System.out.println(numbers.stream().filter(nums -> nums % 2 ==0)
               .toList());

//        System.out.println(streamEvenNumbers);

    }
}
