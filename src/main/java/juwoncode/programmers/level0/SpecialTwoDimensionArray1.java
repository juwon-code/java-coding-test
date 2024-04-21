/**
 * title : 특별한 이차원 배열 1
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class SpecialTwoDimensionArray1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Arrays.deepToString(solution(n)));

        bw.close();
    }

    public static int[][] solution(int n) {
        int[][] array = new int[n][n];

        int pointer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == pointer) {
                    array[i][j] = 1;
                    pointer++;
                    break;
                }
            }
        }

        return array;
    }
}
