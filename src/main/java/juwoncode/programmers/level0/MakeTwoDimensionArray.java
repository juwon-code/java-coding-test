/**
 * title : 2차원으로 만들기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class MakeTwoDimensionArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        bw.write(Arrays.deepToString(solution(array, n)));

        bw.close();
        br.close();
    }

    public static int[][] solution(int[] array, int n) {
        int[][] result = new int[array.length / n][n];

        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = array[index];
                index++;
            }
        }

        return result;
    }
}
