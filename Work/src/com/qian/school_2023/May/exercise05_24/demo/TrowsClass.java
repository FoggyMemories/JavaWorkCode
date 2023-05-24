package com.qian.school_2023.May.exercise05_24.demo;

public class TrowsClass {
    public static void main(String[] args) {
        try {
            array1();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("1.");
            e.printStackTrace();
            System.out.println("2." + e.getLocalizedMessage());
            System.out.println("3." + e.getMessage());
            System.out.println("4." + e);
        } finally {
            System.out.println("索引越界异常");
        }

    }

    //定义方法时抛出异常用throws关键字，是在方法名后面用throws
    //抛出异常类而不是异常对象
    public static void array1() throws IndexOutOfBoundsException {
        int[] arr1 = new int[3];
        arr1[3] = 10;
    }
}
