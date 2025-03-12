package org.example.finterfaces.function;

import java.util.function.Function;

public class AndThenMethod {
    public static void main(String[] args) {

        Function<String, String>upperCase=name->name.toUpperCase();
//        System.out.println( upperCase.apply("hello"));

        Function<String, Integer>length=name->name.length();
//        System.out.println(length.apply("nirma"));

        Function<String, Integer> str = upperCase.andThen(length);

        int result=str.apply("kushal");
        System.out.println(result);
    }
}
