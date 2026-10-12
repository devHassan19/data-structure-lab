package com.ga.dataStructure;

import java.util.Arrays;

public class Exercise1 {
    static void rotate(int[] arr, int d, int n) {

        if (n == 0) {
            return;
        }

        d = d % n;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 3;
        rotate(arr, d, n);
        System.out.println(Arrays.toString(arr));
    }
}
