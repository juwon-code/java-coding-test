/**
 * title : 최솟값 만들기
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeMinimum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array1 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array1, array2)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        return IntStream.range(0, array1.length)
                .map(i -> array1[i] * array2[array2.length - i - 1]).sum();
    }
}
