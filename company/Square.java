package com.company;

public class Square extends Rectangle{

    public Square(){}

    public Square(double side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public double getArea(){
        return super.getArea();
    }

}
