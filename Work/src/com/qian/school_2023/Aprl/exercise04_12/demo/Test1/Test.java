package com.qian.school_2023.Aprl.exercise04_12.demo.Test1;

public class Test {
    public static void main(String[] args) {
        //Bird调用eat方法
        Bird b1 = new Bird();
        b1.eat();
        b1.fly();
        System.out.println(b1.weight);
        new Dog().walk();
    }
}
class Animal{
    //父类、基类、超类
    public int weight;
    String breed;
    public void eat(){
        System.out.println("Animal is eating!");
    }
}
class Bird extends Animal{
    //子类、派生类、扩展类
    public int numberOfWings;
    public void fly(){
        breed = "亚洲种类";
        weight = 100;
        System.out.println(breed + "的小鸟体重" + weight + "克");
    }
}
class Fish extends Animal{
    public int numberOfFins;
    public void swim(){}
}
class Dog extends Animal{
    public int numberOfLegs;
    public void walk(){
        breed = "亚洲种类";
        weight = 10;
        System.out.println(breed + "的小狗体重" + weight + "斤");
    }
}
//一个类有且仅有一个父类,可以有多个接口.
//一个类可以有多个子类
//一个类可以是父类,也可以是子类
//类的private、默认修饰符修饰的成员不能被继承
