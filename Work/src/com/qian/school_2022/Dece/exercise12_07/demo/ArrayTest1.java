package com.qian.school_2022.Dece.exercise12_07.demo;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i] + " ");
        System.out.println();
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
        System.out.println();
        for (int i = 0; i < arr2.length; i++) System.out.printf("arr[%d] = [%d]\t", i, arr2[i]);
    }
}
