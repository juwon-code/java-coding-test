/**
 * title : 평균 구하기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class GetAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static double solution(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }
}
