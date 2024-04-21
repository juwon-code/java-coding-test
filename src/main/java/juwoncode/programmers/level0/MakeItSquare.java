/**
 * title : 정사각형으로 만들기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MakeItSquare {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] array = new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        bw.write(Arrays.deepToString(solution(array)));

        bw.close();
    }

    public static int[][] solution(int[][] array) {
        int col = array.length, row = array[0].length;
        int length = Math.max(col, row);
        int[][] result = new int[length][length];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                result[i][j] = array[i][j];
            }
        }

        return result;
    }
}
