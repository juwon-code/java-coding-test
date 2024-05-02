/**
 * title : K번째 수
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) throws IOException {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.print(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int[] temp = Arrays.stream(array, commands[i][0] - 1, commands[i][1]).sorted().toArray();
            result[i] = temp[commands[i][2] - 1];
        }

        return result;
    }
}
