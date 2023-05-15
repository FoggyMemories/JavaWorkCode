package com.qian.school_2022.Dece.exercise12_07.demo;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5};
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.print(arr[i] + "}");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println();
        double sum = 0;
        double average;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;

        System.out.println("这个数组的所有数和为:" + sum);
        System.out.println("这个数组所有数的平均数为:" + average);

    }
}
