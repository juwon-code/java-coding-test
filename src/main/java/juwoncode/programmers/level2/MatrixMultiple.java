/**
 * title : 행렬의 곱셈
 */

package juwoncode.programmers.level2;

import java.util.Arrays;

public class MatrixMultiple {
    public static void main(String[] args) {
        int[][] array1 = new int[][]{{1, 4}, {3, 2}, {4, 1}};
        int[][] array2 = new int[][]{{3, 3}, {3, 3}};

        System.out.print(Arrays.deepToString(solution(array1, array2)));
    }

    public static int[][] solution(int[][] matrix1, int[][] matrix2) {
        return calculate(matrix1, matrix2);
    }

    public static int[][] calculate(int[][] matrix1, int[][] matrix2) {
        int col = matrix1.length, row = matrix2[0].length;
        int[][] result = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
