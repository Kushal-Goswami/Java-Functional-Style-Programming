package org.example.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapExample {
    public static void main(String[] args) {

        // Converting nested lists into single list

        List<List<Integer>> listOfLists= Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

//        System.out.println(listOfLists.get(0));

        Stream<List<Integer>> listStream=listOfLists.stream();

        //mapping as well as flattening
        List<Integer>result=listStream.flatMap(list -> list.stream())
                .toList();

//        System.out.println(result);

        // Converting nested Arrays into single list

        String[][] nestedStrings=new String[][]{
                {"Apple", "Banana"},
                {"Guava", "Mango"},
                {"Pineapple", "Grapes"}
        };

      Stream<String[]>stream1=Arrays.stream(nestedStrings);
      List<String> finalResult=stream1.flatMap(element->Arrays.stream(element))
              .toList();
        System.out.println(finalResult);


    }
}
