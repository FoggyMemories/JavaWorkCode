package com.qian.school_2022.Dece.exercise12_21.test;

public class test {
    public static void main(String[] args) {
        int[] arr = {100, 2, 99, 33, 19, 78, 3};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {//第一个被比较的数
            for (int j = 1; j < a.length - i; j++) {//第二个被比较的数
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }

        }
    }
}
