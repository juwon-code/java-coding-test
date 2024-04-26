/**
 * title : 최댓값 만들기 (2)
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class MakeMaximum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        Arrays.sort(array);

        return Math.max(array[0] * array[1], array[array.length - 1] * array[array.length - 2]);
    }
}
