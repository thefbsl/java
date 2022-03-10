package com.company;
public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        circle1.setColor("white");
        System.out.println("Circle\nradius " + circle1.getRadius());
        System.out.println("color " + circle1.getColor());
        System.out.println("area " + circle1.getArea());

        System.out.println("-------------------------------------");

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setRadius(5);
        cylinder1.setHeight(10);
        cylinder1.setColor("black");
        System.out.println("Cylinder");
        System.out.println("color " + cylinder1.getColor());
        System.out.println("height " + cylinder1.getHeight());
        System.out.println("area " + cylinder1.getArea());
        System.out.println("volume " +cylinder1.getVolume());

        System.out.println("-------------------------------------");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(25);
        rectangle1.setWidth(8);
        rectangle1.setColor("Red");
        System.out.println("Rectangle\ncolor " + rectangle1.getColor());
        System.out.println("height " + rectangle1.getHeight() + " and " +  "width " + rectangle1.getWidth());
        System.out.println("area " + rectangle1.getArea());

        System.out.println("-------------------------------------");

        Square square1 = new Square(25);
        square1.setColor("grey");
        System.out.println("Square");
        System.out.println("color " + square1.getColor());
        System.out.println("area " + square1.getArea());
    }
}
