/**
 * title : 행렬의 덧셈
 */

package juwoncode.programmers.level1;

import java.util.Arrays;

public class SumMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }

    public static int[][] solution(int[][] array1, int[][] array2) {
        int yLength = array1.length, xLength = array1[0].length;
        int[][] result = new int[yLength][xLength];

        for (int i = 0; i < yLength; i++) {
            for (int j = 0; j < xLength; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return result;
    }
}
