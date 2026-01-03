package com.gfg_potd.topic.sort.dnf;


import java.util.Arrays;

public class Sort012Dsa {


    public void sort012(int[] arr) {
        int p0 = 0;
        int p2 = arr.length - 1;

        int i = 0;
        while (i <= p2) {
            if (arr[i] == 0) {
                swap(arr, i, p0);
                p0++;

                i++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, p2);
                p2--;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Sort012Dsa myClass4 = new Sort012Dsa();
        int[] arr = {0, 2, 0, 2};
        myClass4.sort012(arr);

        System.out.println("arr = " + Arrays.toString(arr));

    }
}
