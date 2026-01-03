package com.gfg_potd.topic.arrays;

public class KthElementDsa {

    public int kthElement(int a[], int b[], int k) {
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            int smaller;
            if (a[i] < b[j]) {
                smaller = a[i];
                i++;
            } else {
                smaller = b[j];
                j++;
            }
            k--;

            if (k == 0) {
                return smaller;
            }
        }

        while (i < a.length) {
            k--;
            if (k == 0) {
                return a[i];
            }
            i++;
        }

        while (j < b.length) {
            k--;
            if (k == 0) {
                return b[j];
            }
            j++;
        }
        return k;
    }

}
