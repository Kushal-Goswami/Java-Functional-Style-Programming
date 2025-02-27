package org.example.lambda;

interface  Calculator{

    int calculate(int a,int b);
}
public class LambdaCalculator {
    public static void main(String[] args) {

//        Calculator addition=(a, b)->a+b;
//        System.out.println(addition.calculate(3,4));
        int addition=calc(20,10, (a,b)->a+b);
        System.out.println(addition);
//        Calculator substraction=(a, b)->a-b;
//        System.out.println(substraction.calculate(20,10));

        int substraction=calc(20,10, (a,b)->a-b);
        System.out.println(substraction);

//        Calculator multiplication=(a, b)->a*b;
//        System.out.println(multiplication.calculate(20,10));

        int multiplication=calc(20,10, (a,b)->a*b);
        System.out.println(multiplication);

//        Calculator division=(a, b)->a/b;
//        System.out.println(division.calculate(50,2));

        int division=calc(20,10, (a,b)->a/b);
        System.out.println(division);




    }

    private static int calc(int a, int b, Calculator calculator)
    {
        return calculator.calculate(a,b);
    }
}
