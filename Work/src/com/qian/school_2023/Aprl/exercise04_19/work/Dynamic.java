package com.qian.school_2023.Aprl.exercise04_19.work;

public class Dynamic {
    public static void main(String[] args) {
        display(new Person());
        display(new Student());
        display(new Graduate());
    }
    private static void display(Person p){
        System.out.println(p.toString());
    }
}



