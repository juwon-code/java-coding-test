/**
 * title : 최댓값 만들기 (1)
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class MakeMaximum1 {
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

        return array[array.length - 1] * array[array.length - 2];
    }
}
