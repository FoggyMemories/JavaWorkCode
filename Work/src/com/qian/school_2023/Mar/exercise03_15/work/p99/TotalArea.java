package com.qian.school_2023.Mar.exercise03_15.work.p99;


public class TotalArea {
    public static void main(String[] args) {
        Circle[] circleArray;   //声明变量
        circleArray  = createCircleArray(); //创建数组
        printCircleArray((circleArray));    //打印数组,并累加圆的面积
    }

    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[10];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);//静态方法
        }
        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray) {
        System.out.println("圆的半径\t\t\t\t\t\t圆的面积");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.println(circleArray[i].getRadius() + "\t\t\t\t"
                    + circleArray[i].getArea());
        }
        System.out.println("总面积是:" + sum(circleArray));
    }

    private static double sum(Circle[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}
