package com.qian.school_2023.Mar.exercise03_08.p88;

class employee {
    static int age = 22;
    static int sum;
    static int salary = 1000;
    String name = "李自成";

    int getSalary() {
        return salary + age;
    }
    static void setSalary(){
        sum = salary + 200;
        salary = sum + age;
    }
}
