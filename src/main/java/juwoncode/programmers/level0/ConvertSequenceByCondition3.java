/**
 * title : 조건에 맞게 수열 변환하기 3
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class ConvertSequenceByCondition3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, k)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, int k) {
        return Arrays.stream(array).map(i -> k % 2 == 0 ? i + k : i * k).toArray();
    }
}
