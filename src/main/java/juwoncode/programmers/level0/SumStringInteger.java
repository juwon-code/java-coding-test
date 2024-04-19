/**
 * title : 문자열 정수의 합
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class SumStringInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(solution(br.readLine())));

        bw.close();
        br.close();
    }

    public static int solution(String string) {
        return Arrays.stream(string.split("")).mapToInt(Integer::parseInt).sum();
    }
}
