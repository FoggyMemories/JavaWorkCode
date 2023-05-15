package com.qian.school_2023.Aprl.exercise04_12.demo.Test2;

public class Test {
    public static void main(String[] args) {
        BabyDog b1 = new BabyDog();
        b1.info();
    }
}

class Dog{
    public int age = 6;
    public void info(){
        System.out.println("Dog的年龄是:" + age + "岁!");
    }
}

class BabyDog extends Dog{
    public int age = 2;
    public void info(){
        System.out.println("BabyDog的年龄是:" + age + "岁,Dog的年龄是:" + super.age + "岁!");
    }
}