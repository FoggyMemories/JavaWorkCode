package com.qian.school_2023.May.exercise05_24.demo;

public class FinallyDemo {


    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8}; //0 ~ 3
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("a[" + i + "] / " + i + " = " + (a[i] / i));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("角标越界异常！");
            } catch (ArithmeticException e) {
                System.out.println("算数异常！");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("finally---" + i);
            }
        }
    }


}
