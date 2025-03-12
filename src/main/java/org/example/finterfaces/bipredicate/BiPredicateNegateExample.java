package org.example.finterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateNegateExample {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> checkNumbers=(num1, num2) -> num1>0 && num2>0;

        BiPredicate<Integer, Integer> negateResult = checkNumbers.negate();

        System.out.println(negateResult.test(5,4));
    }
}
