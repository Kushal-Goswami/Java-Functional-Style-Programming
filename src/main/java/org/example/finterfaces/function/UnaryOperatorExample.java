package org.example.finterfaces.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        //Define a Function interface to print length of a string

//        Function<String, Integer> lengthOfString=(str) -> str.length();
//
//        int length=lengthOfString.apply("hello");
//        System.out.println(length);

        UnaryOperator<Integer> squareOfNumber= (num) -> num * num;

        int square=squareOfNumber.apply(4);
        System.out.println(square);

        UnaryOperator<String> trim=(str) -> str.trim();

        UnaryOperator<String> toUppercase=(str) -> str.toUpperCase();

        Function<String, String> res = trim.andThen(toUppercase);

        String string = res.apply("  hello  ");
        System.out.println(string);

    }
}
