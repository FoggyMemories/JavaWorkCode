package com.qian.school_2023.May.exercise05_31.demo;

public class ThreadTest {
    public static void main(String[] args) {
        //优先级别1 ~ 10,数字越大,级别越高.
        String name = Thread.currentThread().getName();
        System.out.println(name + "优先级:" + Thread.currentThread().getPriority());

        //设置优先级为最低
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(name + "优先级:" + Thread.currentThread().getPriority());
    }
}
