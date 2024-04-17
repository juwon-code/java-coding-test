/**
 * title : 수열과 구간 쿼리 1
 */

package juwoncode.programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SequenceIntervalQueries1 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4};
        int[][] queries = new int[][]{{0, 1}, {1, 2}, {2, 3}};

        System.out.println(Arrays.toString(solution(array, queries)));
    }

    public static int[] solution(int[] array, int[][] queries) {
        for (int[] query : queries) {
            IntStream.rangeClosed(query[0], query[1]).forEach(i -> array[i]++);
        }

        return array;
    }
}
