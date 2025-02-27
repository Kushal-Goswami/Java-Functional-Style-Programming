package org.example.lambda;

class  Alpha implements Runnable
{
    @Override
    public void run() {
        System.out.println("Alpha from Runnable without lambda");
    }
}
public class LambdaThread {
    public static void main(String[] args) {

        Thread t1=new Thread(new Alpha());
        t1.start();

//        Runnable r1=()-> System.out.println("Runnable with Lambda");

        Thread thread=new Thread(()-> System.out.println("Runnable with Lambda"));
        thread.start();


    }
}
