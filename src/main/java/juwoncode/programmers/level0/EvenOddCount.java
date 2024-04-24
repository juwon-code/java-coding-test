/**
 * title : 짝수 홀수 개수
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class EvenOddCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        int[] result = new int[2];

        for (int number : array) {
            if (number % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }

        return result;
    }
}
