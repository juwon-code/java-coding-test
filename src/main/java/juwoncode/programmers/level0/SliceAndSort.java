/**
 * title : 문자열 잘라서 정렬하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class SliceAndSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Arrays.toString(solution(br.readLine())));

        bw.close();
        br.close();
    }

    public static String[] solution(String string) {
        return Arrays.stream(string.split("x"))
                .filter(s -> !s.isEmpty())
                .sorted(Comparator.naturalOrder())
                .toArray(String[]::new);
    }
}
