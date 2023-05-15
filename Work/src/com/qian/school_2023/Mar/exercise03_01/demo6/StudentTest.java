package com.qian.school_2023.Mar.exercise03_01.demo6;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("name = " + stu1.name);
        System.out.println("age = " + stu1.age);
        System.out.println("salary = " + stu1.salary);
        System.out.println("sex = " + stu1.sex);
        System.out.println("edu = " + (int)stu1.eduBackground);
    }
}
