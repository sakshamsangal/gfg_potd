package com.gfg_potd.topic.sort.lib;

import java.util.Arrays;

public class BusConductor {

    public int findMoves(int[] chairs, int[] passengers) {
        Arrays.sort(chairs);
        Arrays.sort(passengers);

        int sum = 0;
        for (int i = 0; i < chairs.length; i++) {
            sum += Math.abs(chairs[i] - passengers[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        BusConductor busConductor = new BusConductor();
        int[] arr = {3, 1, 5};
        int[] pass = {2, 7, 4};


        System.out.println("arr = " + Arrays.toString(arr));
    }

}
