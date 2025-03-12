package org.example.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<Integer> isGreaterThan=num->num > 10;

        boolean result=isGreaterThan.test(14);

        System.out.println(result);
    }
}
