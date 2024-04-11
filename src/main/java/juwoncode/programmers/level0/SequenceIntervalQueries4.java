/**
 * title : 수열과 구간 쿼리 4
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class SequenceIntervalQueries4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[]{0, 1, 2, 4, 3};
        int[][] queries = new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        bw.write(Arrays.toString(solution(arr, queries)));

        bw.close();
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            for (int i = 0; i < arr.length; i++) {
                if (i >= s && i <= e && i % k == 0) {
                    arr[i]++;
                }
            }
        }

        return arr;
    }
}
