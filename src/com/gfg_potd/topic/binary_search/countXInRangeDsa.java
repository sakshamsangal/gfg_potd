package com.gfg_potd.topic.binary_search;

import java.util.ArrayList;

public class countXInRangeDsa {


    private static int getLowerBound(int[] arr, int start, int end, int item) {
        int lowerBound = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == item) {
                lowerBound = mid;
                end = mid - 1;
            } else if (item < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lowerBound;
    }

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

    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] query : queries) {
            int lowerBound = getLowerBound(arr, query[0], query[1], query[2]);
            if (lowerBound == -1) {
                ans.add(0);
            } else {
                int upperBound = getUpperBound(arr, lowerBound, query[1], query[2]);
                ans.add(1 + upperBound - lowerBound);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        SearchInsertKBsService searchInsertKService = new SearchInsertKBsService();
        int i = searchInsertKService.searchInsertK(arr, 2);
        System.out.println("i = " + i);

    }
}
