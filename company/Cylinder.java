package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return super.getLength() * height + 2 * super.getArea();
    }

    public double getVolume(){
        return super.getArea() * height;
    }
}
