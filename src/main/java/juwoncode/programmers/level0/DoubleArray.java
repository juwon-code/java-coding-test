/**
 * title : 배열 두 배로 만들기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(numbers)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
