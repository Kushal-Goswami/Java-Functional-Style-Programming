package org.example.finterfaces.function;

import java.util.function.Function;

public class IdentityMethod {
    public static void main(String[] args) {

        Function<String, String>string=Function.identity();
        String s = string.apply("Kushal");
        System.out.println(s);

    }
}
