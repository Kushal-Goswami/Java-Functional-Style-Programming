package org.example.finterfaces.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> addition=(a, b) -> a+b;

        int result=addition.apply(10, 30);
        System.out.println(result);
    }
}
