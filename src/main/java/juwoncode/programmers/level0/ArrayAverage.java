/**
 * title : 배열의 평균값
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(numbers)));

        bw.close();
        br.close();
    }

    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
