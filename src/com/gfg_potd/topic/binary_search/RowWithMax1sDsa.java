package com.gfg_potd.topic.binary_search;

public class RowWithMax1sDsa {

    private static int getUpperBound(int[] arr, int start, int end, int item) {
        int upperBound = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == item) {
                upperBound = mid;
                start = mid + 1;
            } else if (item < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return upperBound;
    }

    public int rowWithMax1s(int arr[][]) {
        int rightMost0 = arr[0].length;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int ub = getUpperBound(arr[i], 0, arr[i].length, 0);
            if (ub == -1) {
                return i;
            } else if (ub < rightMost0) {
                rightMost0 = ub;
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        RowWithMax1sDsa rowWithMax1sDsa = new RowWithMax1sDsa();
        int[][] arr = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int i = rowWithMax1sDsa.rowWithMax1s(arr);
        System.out.println("i = " + i);
    }

}
