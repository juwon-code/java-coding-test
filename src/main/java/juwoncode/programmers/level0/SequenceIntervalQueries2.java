/**
 * title : 수열과 구간 쿼리 2
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceIntervalQueries2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[]{0, 1, 2, 4, 3};
        int[][] queries = new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        bw.write(Arrays.toString(solution(arr, queries)));

        bw.close();
    }

    public static int[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();

        for (int[] query : queries) {
            int min = 1000001;
            for (int i = 0; i < arr.length; i++) {
                if (i >= query[0] && i <= query[1] && arr[i] > query[2]) {
                    min = Math.min(min, arr[i]);
                }
            }
            answer.add(min == 1000001 ? -1 : min);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
