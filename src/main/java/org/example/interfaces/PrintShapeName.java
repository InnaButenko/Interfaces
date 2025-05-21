package org.example.interfaces;



public class PrintShapeName {


    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.getName());
        Shape square = new Square();
        System.out.println(square.getName());
        Shape triangle = new Triangle();
        System.out.println(triangle.getName());
        Shape quad = new Quad();
        System.out.println(quad.getName());
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getName());


    }
}
