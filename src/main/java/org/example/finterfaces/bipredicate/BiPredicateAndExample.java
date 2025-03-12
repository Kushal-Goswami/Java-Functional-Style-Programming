package org.example.finterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateAndExample {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> checkNumbers=(num1, num2) -> num1>0 && num2>0;

        BiPredicate<Integer, Integer> checkEvenOdd=(num1, num2) -> num1%2==0 && num2%2==0;

        BiPredicate<Integer, Integer> res = checkNumbers.and(checkEvenOdd);

        System.out.println(res.test(4,6));
    }
}
