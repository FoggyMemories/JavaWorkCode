package com.qian.school_2023.Aprl.exercise04_19.demo;

public class Test2 {
    public static void main(String[] args) {
        int[] aa = new int[2];
        for (int i = 0; i < 2; i++) {
            aa[i] = Integer.parseInt(args[i]);
        }
        System.out.println(calo(aa[0],aa[1]));
    }
    private static int calo(int a,int b){
        return a % b;
    }
}
