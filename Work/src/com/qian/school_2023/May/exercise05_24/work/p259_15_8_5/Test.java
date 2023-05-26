package com.qian.school_2023.May.exercise05_24.work.p259_15_8_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
            需求:学生姓名长度为2-5;
                学生年龄为18-25;
         */

        //创建学生对象
        Student s = new Student();

        //键盘录入
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                //提示开始键盘录入学生姓名
                System.out.println("请输入学生的姓名:");
                String name = sc.nextLine();
                s.setName(name);

                //提示开始键盘录入学生年龄
                System.out.println("请输入学生的年龄:");
                String strAge = sc.nextLine();
                int age = Integer.parseInt(strAge);
                s.setAge(age);
                break;
            } catch (NameFormatException | NumberFormatException | AgeOutBoundsException e) {
                e.printStackTrace();
            }
        }

        //打印
        System.out.println(s);
    }
}
