package com.qian.school_2022.Dece.exercise12_14.demo;

public class twoDimensionArrTest2 {
    public static void main(String[] args) {
        int[][] arr1 = {};
        int[][] arr2 = {{11, 22, 33}, {22, 33, 44}, {33, 44, 55}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print("arr2[" + "][" + j + "]=" + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}