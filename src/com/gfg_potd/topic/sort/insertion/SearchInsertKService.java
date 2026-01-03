package com.gfg_potd.topic.sort.insertion;


public class SearchInsertKService {


    private static int idxOfJustSmaller(int[] arr, int end, int item) {
        while (-1 < end && arr[end] >= item) {
            end--;
        }
        return end;
    }

    public int searchInsertK(int arr[], int k) {
        return idxOfJustSmaller(arr, arr.length - 1, k) + 1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        SearchInsertKService searchInsertKService = new SearchInsertKService();
        int i = searchInsertKService.searchInsertK(arr, 2);
        System.out.println("i = " + i);
    }
}
