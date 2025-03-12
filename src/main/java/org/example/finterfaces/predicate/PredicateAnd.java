package org.example.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateAnd {
    public static void main(String[] args) {

        Predicate<String>isEmptyString=(str)-> !str.isEmpty();

        Predicate<String>isGreaterThan=(str)->str.length()>8;

        Predicate<String> res = isEmptyString.and(isGreaterThan);

        boolean result=res.test("Hello World");
        System.out.println(result);
    }
}
