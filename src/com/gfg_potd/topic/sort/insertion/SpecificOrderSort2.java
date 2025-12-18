package com.gfg_potd.topic.sort.insertion;

import java.util.Arrays;

public class SpecificOrderSort2 {


    private static int idxOfJustSmaller(int[] arr, int end, int item, int oddCount) {
        while (oddCount <= end && arr[end] > item) {
            arr[end + 1] = arr[end];
            end--;
        }
        return end;
    }

    private static int idxOfJustGreater(int[] arr, int end, int item) {
        while (-1 < end && arr[end] < item) {
            arr[end + 1] = arr[end];
            end--;
        }
        return end;
    }


    private static int getOddCount(int[] arr) {
        int oddCount = 0;
        for (int item : arr) {
            if ((item & 1) == 1) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public void sortIt(int[] arr) {
        int oddCount = getOddCount(arr);
        int[] res = new int[arr.length];

        int oddEnd = -1;
        int evenEnd = oddCount - 1;
        for (int item : arr) {
            if ((item & 1) == 1) {
                int k = idxOfJustGreater(res, oddEnd, item);
                res[k + 1] = item;
                oddEnd++;
            } else {
                int k = idxOfJustSmaller(res, evenEnd, item, oddCount);
                res[k + 1] = item;
                evenEnd++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
    }


    public static void main(String[] args) {
        SpecificOrderSort2 specificOrderSort2 = new SpecificOrderSort2();
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        specificOrderSort2.sortIt(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
