package com.qian.school_2023.May.exercise05_06.work.p139_9_6_习题_4;

public class Teddy extends Dog{
    @Override
    public void swim() {
        System.out.println("Teddy犬在游泳");
    }

    public Teddy() {
    }

    public Teddy(String name, int age) {
        super(name, age);
    }
}
