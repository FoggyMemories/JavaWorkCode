package com.qian.school_2022.Novm.exercise11_02.work;

public class p41_3_6_1 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 13; i++) {
            long index = 1;
            if((i % 2) == 1){
                for (int m = 1; m <= i; m++) {
                    index = index * m;
                }
                sum = index + sum;
            }
        }
        System.out.println(sum);
    }
}
