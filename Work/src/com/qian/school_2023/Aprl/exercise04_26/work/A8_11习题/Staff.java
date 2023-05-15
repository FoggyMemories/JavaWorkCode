package com.qian.school_2023.Aprl.exercise04_26.work.A8_11习题;

public class Staff extends Employee{
    private String office = "上司";

    @Override
    public String toString() {
        return "Staff职务是:" + office;
    }
}
