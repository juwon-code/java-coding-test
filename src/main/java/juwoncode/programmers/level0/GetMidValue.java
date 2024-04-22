/**
 * title : 중앙값 구하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class GetMidValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        array = Arrays.stream(array).sorted().toArray();

        return array[array.length / 2];
    }
}
