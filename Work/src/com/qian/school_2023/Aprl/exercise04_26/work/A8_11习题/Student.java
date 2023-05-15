package com.qian.school_2023.Aprl.exercise04_26.work.A8_11习题;

public class Student extends Person {
    private String classNumber = "2";
    private int grade = 1;


    @Override
    public String toString() {
        return "Student班级为:"+classNumber + " ,年级为:" + grade;
    }
}
