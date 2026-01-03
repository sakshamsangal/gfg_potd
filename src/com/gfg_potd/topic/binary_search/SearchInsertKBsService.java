package com.gfg_potd.topic.binary_search;


public class SearchInsertKBsService {


    private static int binarySearch(int[] arr, int item) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == item) {
                return mid;
            } else if (item < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    public int searchInsertK(int arr[], int k) {
        return binarySearch(arr, k);
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        SearchInsertKBsService searchInsertKService = new SearchInsertKBsService();
        int i = searchInsertKService.searchInsertK(arr, 2);
        System.out.println("i = " + i);
    }
}
