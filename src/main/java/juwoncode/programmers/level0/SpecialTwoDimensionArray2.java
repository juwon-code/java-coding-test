/**
 * title : 특별한 이차원 배열 2
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SpecialTwoDimensionArray2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] array= new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};

        bw.write(String.valueOf(solution(array)));
        bw.close();
    }

    public static int solution(int[][] array) {
        int n = array.length, result = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] != array[j][i]) {
                    result = 0;
                    break;
                }
            }
            if (result == 0) {
                break;
            }
        }

        return result;
    }
}
