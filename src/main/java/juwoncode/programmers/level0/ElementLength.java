/**
 * title : 배열 원소의 길이
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class ElementLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(", ");
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(String[] array) {
        return Arrays.stream(array)
                .map(String::length)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
