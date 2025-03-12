package org.example.finterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateTestExample {
    public static void main(String[] args) {

        BiPredicate<String, String> strLength=(str1, str2) -> str1.length()==str2.length();

        boolean result=strLength.test("hello", "hell");
        System.out.println(result);
    }
}
