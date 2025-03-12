package org.example.finterfaces.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (num1, num2) -> num1 + num2;
        int result = add.apply(2, 4);
        System.out.println(result);

        BinaryOperator<Integer> addNumbers = (num1, num2) -> num1 + num2;
        int res = addNumbers.apply(12, 10);
        System.out.println(res);

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10);

        BinaryOperator<List<Integer>> mergeLists = (l1, l2) -> {
            List<Integer> list3 = new ArrayList<>(l1);
            list3.addAll(l2);
            return list3;
        };

        List<Integer> mergedList = mergeLists.apply(list1, list2);
        System.out.println(mergedList);


    }
}