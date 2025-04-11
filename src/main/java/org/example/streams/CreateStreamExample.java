package org.example.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {
        // Create a Stream from List

        System.out.println("Create a Stream from List");

        List<String> fruitList= Arrays.asList("Banana", "Guava", "Orange", "Mango", "Apple");

        Stream<String> stringStream=fruitList.stream();

//       stringStream.forEach(element -> System.out.println(element));

        stringStream.forEach(System.out::println);
        System.out.println();

        // Create a Stream from Set

        System.out.println("Create a Stream from Set");
        Set<String> fruitSet=new HashSet<>(fruitList);
        Stream<String> streamSet=fruitSet.stream();
        streamSet.forEach(System.out::println);
        System.out.println();

        // Create a Stream from Map

        System.out.println("Create a Stream from Map");

        Map<String, Integer> fruitMap=new HashMap<>();
        fruitMap.put("Mango", 1);
        fruitMap.put("Apple", 2);
        fruitMap.put("Banana", 3);
        fruitMap.put("Guava", 4);

        // Create a Stream from Map's entrySet

        Stream<Map.Entry<String, Integer>> streamMapEntry = fruitMap.entrySet().stream();
        streamMapEntry.forEach(System.out::println);
        System.out.println();

        // Create a Stream from Map's keySet
        System.out.println("Create a Stream from Map's keySet");
        Stream<String> stringMapKey=fruitMap.keySet().stream();
        stringMapKey.forEach(System.out::println);
        System.out.println();

        // Create a Stream from Map's values
        System.out.println("Create a Stream from Map's values");
        Stream<Integer> streamMapValues = fruitMap.values().stream();
        streamMapValues.forEach(System.out::println);

        //Create Stream from an Array
        System.out.println("Create Stream from an Array");
        String[] str={"Banana", "Guava", "Orange", "Mango", "Apple"};
        Stream<String> streamArray = Arrays.stream(str);
        streamArray.forEach(System.out::println);
        System.out.println();

        //Create Stream using Stream.of() method
        System.out.println("Create Stream using Stream.of() method");
        Stream<String> streamOf = Stream.of("Banana", "Guava", "Orange", "Mango", "Apple");
        streamOf.forEach(System.out::println);


    }
}
