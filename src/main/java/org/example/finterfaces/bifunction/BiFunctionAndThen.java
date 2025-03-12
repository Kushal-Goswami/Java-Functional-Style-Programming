package org.example.finterfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndThen {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer>productOfTwoNumbers=(a, b) -> a*b;

        Function<Integer, String> function = num -> "Product : " +num;

        BiFunction<Integer, Integer, String> res = productOfTwoNumbers.andThen(function);

       String result= res.apply(2,3);
        System.out.println(result);

    }
}
