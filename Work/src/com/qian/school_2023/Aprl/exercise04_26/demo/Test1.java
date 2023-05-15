package com.qian.school_2023.Aprl.exercise04_26.demo;

public class Test1 {
    public static void main(String[] args) {
        /*
        1.接口就是一种极端的类，接口中只有常量和抽象方法
        2.抽象方法就是方法没有方法体。使用方法名后面的大括号用分号来替换。该方法用abstract修饰.
        3.声明一个接口用interface
        4.接口的变量修饰符默认为:final public static ,接口的方法默认修饰符是public abstract
        5.接口的实现类,如果是普通类,必须实现接口的所有方法.
        6.不能对接口new对象
        7.接口类型的变量可以被赋值子类对象
         */
        Elephant e1 = new Elephant();
        e1.show();
        System.out.println(Animal.type);
        System.out.println(Elephant.type);
        System.out.println(e1.type);

        //多态
        Animal an1 = new Elephant();
    }
}
