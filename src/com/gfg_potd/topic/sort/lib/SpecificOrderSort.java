package com.gfg_potd.topic.sort.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SpecificOrderSort {

    public void sortIt(int[] arr) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int item : arr) {
            if ((item & 1) == 1) {
                odds.add(item);
            } else {
                evens.add(item);
            }
        }

        odds.sort(Comparator.reverseOrder());
        evens.sort(Comparator.naturalOrder());

        odds.addAll(evens);

        for (int i = 0; i < arr.length; i++) {
            arr[i]= odds.get(i);
        }

    }

    public static void main(String[] args) {
        SpecificOrderSort specificOrderSort = new SpecificOrderSort();
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        specificOrderSort.sortIt(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
