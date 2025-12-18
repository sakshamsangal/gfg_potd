package com.gfg_potd.topic.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlapInt {

    public ArrayList<int[]> mergeOverlap(int[][] arr) {

        // sort on start time
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        ArrayList<int[]> ls = new ArrayList<>();
        ls.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] last = ls.get(ls.size() - 1);
            int[] curr = arr[i];
            if (last[1] < curr[0]) {
                ls.add(curr);
            } else {
                last[1] = Math.max(last[1], curr[1]);
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1
    }
}
