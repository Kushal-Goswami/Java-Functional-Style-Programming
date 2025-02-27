package org.example.lambda;

interface Shape
{
    void draw();
}

class Rectangle implements Shape
{

    @Override
    public void draw() {
        System.out.println("Rectangle is drawing");
    }
}
class Square implements Shape
{

    @Override
    public void draw() {
        System.out.println("Square is drawing");
    }
}

class Circle implements Shape
{

    @Override
    public void draw() {
        System.out.println("Circle is drawing");
    }
}
public class LaunchLambda1 {
    public static void main(String[] args) {

//        Shape rectangle = new Rectangle();
//        shape.draw();

//        Shape square = new Square();
//        shape.draw();
//
//        Shape circle = new Circle();
//        shape.draw();

//        Shape rectangle=()->System.out.println("Rectangle is drawing");
            drawing(()->System.out.println("Rectangle is drawing"));

//        Shape square=()->System.out.println("Square is drawing");

            drawing(()->System.out.println("Square is drawing"));

//        Shape circle=()->System.out.println("Circle is drawing");

            drawing(()->System.out.println("Circle is drawing"));

    }

    private static void drawing(Shape shape)
    {
        shape.draw();
    }
}
