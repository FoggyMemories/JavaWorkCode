package com.qian.school_2022.Dece.exercise12_05.demo;

import java.util.Random;

public class avgCount {
    public static void main(String[] args) {
        Random r = new Random();
        int number;
        double sum = 0, squareSum = 0, avg;
        for (int i = 1; i <= 10; i++) {
            number = r.nextInt(99) + 1;
            sum += number;
            squareSum += Math.pow(number, 2);
        }
        System.out.println(sum);
        System.out.println(squareSum);
        avg = sum / 10;
        System.out.println("这个10个数的平均值是" + avg);
    }
}
