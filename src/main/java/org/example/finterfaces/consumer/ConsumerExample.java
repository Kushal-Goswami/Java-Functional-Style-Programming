package org.example.finterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> System.out.println(str);

        consumer.accept("Hello");

        Consumer<String> uppercase=(test) -> System.out.println("Uppercase : "+test.toUpperCase());
        Consumer<String> con = consumer.andThen(uppercase);

        con.accept("World");


    }
}
