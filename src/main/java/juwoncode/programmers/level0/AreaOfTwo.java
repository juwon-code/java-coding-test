/**
 * title : 2의 영역
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class AreaOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        int minimum = 100000, maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                minimum = Math.min(minimum, i);
                maximum = Math.max(maximum, i);
            }
        }

        return minimum <= maximum ? Arrays.copyOfRange(array, minimum, maximum + 1) : new int[]{-1};
    }
}
