package com.gfg_potd.topic.string;

public class AreRotationsDsa {

    public boolean areRotations(String s1, String s2) {
        boolean isRotated = false;
        if (s1.length() == s2.length()) {
            String comb = s1 + s1;
            isRotated = comb.contains(s2);
        }
        return isRotated;
    }

    public static void main(String[] args) {

    }
}
