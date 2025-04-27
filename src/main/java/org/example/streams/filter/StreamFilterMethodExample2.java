package org.example.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilterMethodExample2 {
    public static void main(String[] args) {

        List<String> fruits= Arrays.asList("Mango", "Banana", "Guava", "Pineapple");

        //Traditional way to filter (before java 8)

        List<String> filteredFruit=new ArrayList<>();

        for (String fruit:fruits)
        {
            if (fruit.equals("Banana"))
            {
                filteredFruit.add(fruit);
            }
        }
        System.out.println(filteredFruit);

        //Using Stream API's filter() method

        System.out.println(fruits.stream().filter(filterResult -> filterResult.equals("Banana")).toList());




    }
}
