/**
 * title : 배열 만들기 3
 */

package juwoncode.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[][] intervals = new int[][]{{1, 3}, {0, 4}};

        System.out.println(Arrays.toString(solution(array, intervals)));
    }

    public static int[] solution(int[] array, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            for (int i = start; i <= end; i++) {
                list.add(array[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
