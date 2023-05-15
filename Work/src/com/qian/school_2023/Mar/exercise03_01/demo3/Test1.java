package com.qian.school_2023.Mar.exercise03_01.demo3;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor(1);
        c1.setType(1);
        c1.setBrand("S-2210");
        System.out.println("车的牌照是:" + c1.getBrand() + ",车的颜色是:" + c1.printColor(c1.getColor())
                + ",车的类型是:" + c1.printType(c1.getType()));

        Car c2 = new Car();
        c2.setColor(20);
        c2.setType(2);
        c2.setBrand("S-2310");
        System.out.println("车的牌照是:" + c2.getBrand() + ",车的颜色是:" + c2.printColor(c2.getColor())
                + ",车的类型是:" + c2.printType(c2.getType()));

    }
}
