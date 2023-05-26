package com.qian.school_2023.May.exercise05_24.work.p258;

public class FinallyDemo {
    public static void main(String[] args) {
        int i;
        int[] a = {5, 6, 7, 8};
        for (i = 0; i < 5; i++) {
            try {
                System.out.println("a[" + i + "] / " + i + " = " + (a[i] / i));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("捕获数组下表越界异常！");
            } catch (ArithmeticException e) {
                System.out.println("捕获算数异常!");
            } catch (Exception e) {
                System.out.println("捕获" + e.getMessage() + "异常");
            } finally {
                System.out.println(" finally " + i);
            }
            System.out.println("正常结束");
        }
    }
}
