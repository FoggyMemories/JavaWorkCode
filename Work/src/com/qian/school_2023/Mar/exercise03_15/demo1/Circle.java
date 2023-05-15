package com.qian.school_2023.Mar.exercise03_15.demo1;

public class Circle {
    final static double PI=3.14159;
    private double radius;
    private static int numOfObject = 0;
    public Circle(){
        radius = 1.0;
        numOfObject++;
    }
    public Circle(double r){
        radius = r;
        numOfObject++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public static int getNumOfObject(){
        return numOfObject;
    }
    public double getArea(){
        return radius*radius*PI;
    }

}
