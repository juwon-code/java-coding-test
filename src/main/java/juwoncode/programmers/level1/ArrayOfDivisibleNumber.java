/**
 * title : 나누어 떨어지는 숫자 배열
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class ArrayOfDivisibleNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int divisor = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, divisor)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, int divisor) {
        int[] result = Arrays.stream(array).filter(i -> i % divisor == 0).sorted().toArray();

        return result.length == 0 ? new int[]{-1} : result;
    }
}
