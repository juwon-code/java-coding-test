/**
 * title : x 사이의 개수
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class CountBetweenX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Arrays.toString(solution(br.readLine())));

        bw.close();
        br.close();
    }

    public static int[] solution(String string) {
        return Arrays.stream(string.split("x", -1))
                .mapToInt(String::length)
                .toArray();
    }
}
