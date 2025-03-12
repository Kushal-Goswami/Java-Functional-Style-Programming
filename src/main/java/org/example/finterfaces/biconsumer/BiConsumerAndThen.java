package org.example.finterfaces.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerAndThen {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> printNumbers=(num1, num2) -> System.out.println("Numbers : "+num1 +","+num2);

        BiConsumer<Integer, Integer> addNumbers=(num1, num2) -> System.out.println("Sum is : "+ (num1+num2));

        BiConsumer<Integer, Integer> res = printNumbers.andThen(addNumbers);

       res.accept(5,10);
    }
}
