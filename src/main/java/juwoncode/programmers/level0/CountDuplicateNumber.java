/**
 * title : 중복된 숫자 개수
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class CountDuplicateNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(array, n)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
