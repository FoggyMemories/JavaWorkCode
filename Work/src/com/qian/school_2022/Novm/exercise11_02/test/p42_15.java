package com.qian.school_2022.Novm.exercise11_02.test;

import java.util.Scanner;

public class p42_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        switch (a) {
            case 1 -> x += 2;
            case 2 -> x += 3;
            case 3 -> x += 4;
            case 4 -> x += 5;

        }
        System.out.println(x);
    }
}
