package org.example.finterfaces.function;


import java.util.function.Function;

public class ApplyFunction {
    public static void main(String[] args) {

//        Function<String, String>func1=new Function<String, String>() {
//
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        };
//        String str=func1.apply("Bob");
//        System.out.println(str);

        Function<String, String> func=msg -> msg.toUpperCase();
        String str = func.apply("kushal");
        System.out.println(str);

        Function<String, String>func2=firstName->new StringBuilder(firstName).reverse().toString();

        System.out.println(func2.apply("KUSHAL"));

    }
}
