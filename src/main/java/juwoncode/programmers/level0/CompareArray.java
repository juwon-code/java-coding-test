/**
 * title : 배열 비교하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class CompareArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array1 = stringToIntArray(br.readLine());
        int[] array2 = stringToIntArray(br.readLine());
        bw.write(String.valueOf(solution(array1, array2)));

        bw.close();
        br.close();
    }

    public static int[] stringToIntArray(String string) {
        return Arrays.stream(string.split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    public static int solution(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return array1.length > array2.length ? 1 : -1;
        }

        int sum1 = Arrays.stream(array1).sum();
        int sum2 = Arrays.stream(array2).sum();

        if (sum1 == sum2) {
            return 0;
        }

        return sum1 > sum2 ? 1 : -1;
    }
}
