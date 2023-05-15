package com.qian.school_2022.Novm.exercise11_09.test;

import java.util.Scanner;

public class meansTest2 {
    public static void main(String[] args) {
        /*
        自定义一个方法，输出你的姓名和班级
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = name(sc.next());
        System.out.println("请输入你的班级：");
        String classRoomNumber = classRoomNumber(sc.next());
        System.out.println(name);
        System.out.println(classRoomNumber);
        print(20);


        double result = add(1,2);
        System.out.println(result);

        sex('男');
    }

    public static String name(String str) {

        return str;
    }

    public static String classRoomNumber(String str) {

        return str;
    }

    public static void print(int age) {
        System.out.println("今年" + age + "岁了");
    }
    public static double add(double a,double b){
        double result = a + b;
        return result;
    }

    public static void sex(char x){
        System.out.println("您的性别是:" + x);
    }
}
