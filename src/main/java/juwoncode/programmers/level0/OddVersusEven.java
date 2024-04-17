/**
 * title : 홀수 vs 짝수
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class OddVersusEven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        int odds = 0, evens = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evens += array[i];
            } else {
                odds += array[i];
            }
        }

        return Math.max(odds, evens);
    }
}
