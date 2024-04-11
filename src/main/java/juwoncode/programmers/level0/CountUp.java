/**
 * title : 카운트 업
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CountUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(start, end)));

        bw.close();
        br.close();
    }

    public static int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
