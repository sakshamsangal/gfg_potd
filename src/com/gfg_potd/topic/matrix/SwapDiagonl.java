package com.gfg_potd.topic.matrix;

public class SwapDiagonl {


    public void swapDiagonal(int[][] mat) {
        int j = mat.length;
        for (int row = 0; row < mat.length; row++) {
            j--;
            int item = mat[row][row];
            mat[row][row] = mat[row][j];
            mat[row][j] = item;
        }
    }

}
