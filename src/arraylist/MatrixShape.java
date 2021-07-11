package arraylist;

import java.util.ArrayList;

public class MatrixShape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) return mat;

        int[] num1 = mat[0];
        int[] num2 = mat[1];

        // 合并
        ArrayList list = new ArrayList();
        for (int i : num1) {
            list.add(i);
        }
        for (int i : num2) {
            list.add(i);
        }

        int[][] ans = new int[r][c];




        return ans;
    }
}
