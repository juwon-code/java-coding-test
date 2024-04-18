/**
 * title : 길이에 따른 연산
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class OperationByLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        return array.length >= 11
                ? Arrays.stream(array).sum()
                : Arrays.stream(array).reduce(1, (a, b) -> a * b);
    }
}
