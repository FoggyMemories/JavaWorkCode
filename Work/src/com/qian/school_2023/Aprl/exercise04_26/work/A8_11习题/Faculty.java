package com.qian.school_2023.Aprl.exercise04_26.work.A8_11习题;

public class Faculty extends Employee{
    private int officeHours = 10;
    private int grade = 2;


    @Override
    public String toString() {
        return "Faculty办公时间为:" + officeHours + " ,级别为:" + grade;
    }
}
