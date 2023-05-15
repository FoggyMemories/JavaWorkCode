package com.qian.school_2022.Novm.exercise11_09.test;

public class task1 {
    public static void main(String[] args) {
        /*
        输出5*5的“#”符号组成的是新等腰直角三角形
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#\t");
            }
            System.out.println();
        }
    }
}
