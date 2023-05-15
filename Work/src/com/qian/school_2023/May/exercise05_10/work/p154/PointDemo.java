package com.qian.school_2023.May.exercise05_10.work.p154;

public class PointDemo {
    public static void main(String[] args) {
        Point<String> p1 = new Point<>();
        p1.setX("东经180度");
        p1.setY("北纬210度");

        System.out.println("p1的坐标是:" + p1.getX() + " , " + p1.getY());

        Point<Float> p2 = new Point<>();
        p2.setX(56.0f);
        p2.setY(78.0f);

        System.out.println("p2的坐标是:" + p2.getX() + " , " + p2.getY());
    }
}
