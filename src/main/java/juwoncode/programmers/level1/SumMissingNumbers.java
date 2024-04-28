/**
 * title : 없는 숫자 더하기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumMissingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        String string = Arrays.toString(array);

        return IntStream.rangeClosed(1, 9).filter(i -> !string.contains(String.valueOf(i))).sum();
    }
}
