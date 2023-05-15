package com.qian.school_2023.Mar.exercise03_15.demo1;

public class Test11 {
    //定义方法时的参数变量是形参,调用方法时给形参附的值是实参
    //参数可以是普通类型,也可以是引用类型变量,引用类型变量有类类型变量
    //c1,c2都是Circle类的类类型变量.
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("圆的半径:" + c1.getRadius() + "圆的面积是:"+c1.getArea() + ",此时是第"
        + Circle.getNumOfObject()+"个对象!");
        Circle c2 = new Circle();
        System.out.println("圆的半径:" + c2.getRadius() + "圆的面积是:"+c2.getArea() + ",此时是第"
                + Circle.getNumOfObject()+"个对象!");
    }
}