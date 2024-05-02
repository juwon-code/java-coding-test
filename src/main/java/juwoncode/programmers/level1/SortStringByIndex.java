/**
 * title : 문자열 내 마음대로 정렬하기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class SortStringByIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(", ");
        int number = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, number)));

        bw.close();
        br.close();
    }

    public static String[] solution(String[] array, int number) {
        String[] result = Arrays.stream(array)
                .map(s -> s.charAt(number) + s)
                .sorted()
                .toArray(String[]::new);

        return Arrays.stream(result)
                .map(s -> s.substring(1))
                .toArray(String[]::new);
    }
}
