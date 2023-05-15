package com.qian.school_2022.Dece.exercise12_05.demo;

public class method {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        System.out.printf("交换前a =  %d,b = %d",arr[0],arr[1]);
        System.out.println();
        swap(arr);
        System.out.printf("交换后a =  %d,b = %d",arr[0],arr[1]);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
