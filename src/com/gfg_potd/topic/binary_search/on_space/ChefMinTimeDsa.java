package com.gfg_potd.topic.binary_search.on_space;


import java.util.Arrays;

class ChefMinTimeDsa {
    public int getDonutCount(int rank, int givenTime) {
        int donutCount = 0;
        int timeToCook = rank;
        while (timeToCook <= givenTime) {
            donutCount++;

            givenTime -= timeToCook;
            timeToCook += rank;
        }

        return donutCount;
    }


    private int binarySearch(int[] arr, int end, int n) {
        int ans = end;
        int start = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int donutSum = 0;
            for (int rank : arr) {
                int donutCount = getDonutCount(rank, mid);
                if (donutCount == 0) {
                    break;
                }
                donutSum += donutCount;
            }

            if (donutSum >= n) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // todo: can be improved
    public int minTime(int[] ranks, int n) {
        Arrays.sort(ranks);
        int max = ranks[ranks.length - 1];

        // last term
        int lastTerm = max + (n - 1) * max;

        // maxTime
        int maxTime = (int) ((n / 2.0) * (max + lastTerm));

        return binarySearch(ranks, maxTime, n);
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4};
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1};
        ChefMinTimeDsa chefMinTimeDsa = new ChefMinTimeDsa();
        int minTime = chefMinTimeDsa.minTime(arr, 8);
        System.out.println("minTime = " + minTime);
    }
}