package org.example.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateNegate {
    public static void main(String[] args) {

        Predicate<String>isEmptyString=str->str.isEmpty();

        Predicate<String>isNotEmptyString=isEmptyString.negate();

        boolean result=isNotEmptyString.test("Hello");
        System.out.println(result);
    }
}
