package com.qian.school_2022.Novm.exercise11_09.test;

public class meansTest1 {   //方法就是吧一些执行语句放在一定格式的代码块里面，可以反复多次利用
    public static void main(String[] args) {
        printTriangle();
        printSquareness();
    }

    //定义方法一般放在类中 main 方法除外。
    public static void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#\t");
            }
            System.out.println();
        }
    }

    public static void printSquareness(){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print("￥\t");
            }
            System.out.println();
        }
    }
}
