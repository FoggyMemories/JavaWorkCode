package com.qian.school_2023.Aprl.exercise04_26.demo;

/*
1.如果一个类用abstract修饰,这个类就是抽象类.
2.抽象类里面可以有抽象方法,也可以没有抽象方法.如果一个类有抽象方法,则一定是抽象类.
3.抽象类的子类,如果是普通类,就实现抽象类的所有方法;如果是抽象类则可以不是先抽象方法
 */
public class Test3 {
    public static void main(String[] args) {
        new ZhangTeacher();
        Student s1;
        Teacher t11 = new ZhangTeacher();
        t11.info();
    }
}
