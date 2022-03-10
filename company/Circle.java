package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength(){
        return Math.PI * 2 * radius;
    }
}
