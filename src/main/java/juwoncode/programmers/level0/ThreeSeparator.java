/**
 * title : 세 개의 구분자
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class ThreeSeparator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Arrays.toString(solution(br.readLine())));

        bw.close();
        br.close();
    }

    public static String[] solution(String string) {
        String[] result = Arrays.stream(string.split("[abc]", -1))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        return result.length > 0 ? result : new String[]{"EMPTY"};
    }
}
