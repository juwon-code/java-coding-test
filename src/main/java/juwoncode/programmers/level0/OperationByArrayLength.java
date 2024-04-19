/**
 * title : 배열의 길이에 따라 다른 연산하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class OperationByArrayLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, n)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, int n) {
        int length = array.length;

        if (length % 2 == 0) {
            return IntStream.range(0, length).map(i -> i % 2 != 0 ? array[i] + n : array[i]).toArray();
        }

        return IntStream.range(0, length).map(i -> i % 2 == 0 ? array[i] + n : array[i]).toArray();
    }
}
