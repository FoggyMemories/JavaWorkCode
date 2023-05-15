package com.qian.school_2022.Dece.exercise12_21.test;

public class test2 {
    public static void main(String[] args) {
        try {
            int a = 2 / 0;
            System.out.print("1");
        } catch (NullPointerException e) {
            System.out.print(2);
        } finally {
            System.out.print("3");
        }
        System.out.print("4");
    }
}
