package com.qian.school_2023.Aprl.exercise04_26.work.A8_11习题;

public class Employee extends Person{
    private String name = "qr";
    private int salary = 99999999;
    private int employmentPeriod = 10;

    @Override
    public String toString() {
        return "Employee的姓名为:" + name + " ,薪水是:" + salary + " ,受雇日期为:" + employmentPeriod;
    }
}
