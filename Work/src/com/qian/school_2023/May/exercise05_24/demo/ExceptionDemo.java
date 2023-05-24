package com.qian.school_2023.May.exercise05_24.demo;

public class ExceptionDemo {

    int[] a = new int[5];

    public void addNewMember() throws Exception {
        for (int i = 0, k = 0; ; i++, k++) {
            if (i > 4) {
                throw new Exception();
            } else {
                System.out.println("k = " + k + ",添加成功");
            }

        }
    }

    public void cth() {
        try {
            addNewMember();
        } catch (Exception e) {
            System.out.println("捕获到i > 4异常!");
        }
    }

    public static void main(String[] args) {
        ExceptionDemo eDemo = new ExceptionDemo();
        try {
            eDemo.cth();
        } catch (Exception e) {
            System.out.println("捕获到i > 4异常!");
        }
    }
}

