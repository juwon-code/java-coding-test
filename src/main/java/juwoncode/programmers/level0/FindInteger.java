/**
 * title : 정수 찾기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class FindInteger {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[]{15, 98, 23, 2, 15};
        int n = 20;
        bw.write(String.valueOf(solution(array, n)));

        bw.close();
    }

    public static int solution(int[] array, int n) {
        return Arrays.stream(array).filter(i -> i == n).findAny().isPresent() ? 1 : 0;
    }
}
