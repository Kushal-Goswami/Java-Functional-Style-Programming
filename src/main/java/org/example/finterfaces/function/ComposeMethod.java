package org.example.finterfaces.function;

import java.util.function.Function;

public class ComposeMethod {
    public static void main(String[] args) {

        Function<String, String>trim=msg->msg.trim();
//        System.out.println(trim.apply("  manoj  "));

        Function<String, String>upperCase=msg->msg.toUpperCase();

        Function<String, String> res = upperCase.compose(trim);

        String result = res.apply("   hello   ");
        System.out.println(result);

    }
}
