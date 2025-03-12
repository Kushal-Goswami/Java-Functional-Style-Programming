package org.example.finterfaces.bifunction;

import java.util.function.BiFunction;

public class BiFunctionRectangle {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> calculateRectangle=(length, width) -> length * width;

        int area=calculateRectangle.apply(10,20);
        System.out.println(area);
    }
}
