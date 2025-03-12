package org.example.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateOr {
    public static void main(String[] args) {

        Predicate<Integer> islessThan=(num)-> num < 5;

        Predicate<Integer>isGreaterThan=(num2)->num2 >10;

        Predicate<Integer> res = islessThan.or(isGreaterThan);

        boolean result=res.test(9);
        System.out.println(result);
    }
}
