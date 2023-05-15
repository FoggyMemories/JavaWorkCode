package com.qian.school_2022.Dece.exercise12_05.work;

public class CustomMethod {
    public static void main(String[] args) {
        int[] arr = {65, 984, 321, 458, 4896, 3152};
        //冒泡排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
