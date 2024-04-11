/**
 * title : 수열과 구간 쿼리 3
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class SequenceIntervalQueries3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[]{0, 1, 2, 3, 4};
        int[][] queries = new int[][]{{0, 3}, {1, 2}, {1, 4}};
        bw.write(Arrays.toString(solution(arr, queries)));

        bw.close();
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }

        return arr;
    }
}
