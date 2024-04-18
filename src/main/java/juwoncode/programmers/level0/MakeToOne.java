/**
 * title : 1로 만들기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class MakeToOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        int result = 0;

        for (int number : array) {
            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = (number - 1) / 2;
                }
                result++;
            }
        }

        return result;
    }
}
