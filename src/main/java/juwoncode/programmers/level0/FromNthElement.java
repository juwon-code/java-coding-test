/**
 * title : n 번째 원소부터
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class FromNthElement {
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
        return Arrays.copyOfRange(array, --n, array.length);
    }
}
