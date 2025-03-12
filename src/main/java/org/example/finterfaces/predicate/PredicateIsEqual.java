package org.example.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateIsEqual {
    public static void main(String[] args) {

        Predicate<String>isJava=Predicate.isEqual("Java");

        boolean result=isJava.test("Java");
        System.out.println(result);
    }
}
