/**
 * title : 문자열 바꿔서 찾기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindStringChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        String pat = br.readLine();
        bw.write(String.valueOf(solution(string, pat)));

        bw.close();
        br.close();
    }

    public static int solution(String string, String pat) {
        return Arrays.stream(string.split(""))
                .map(s -> s.equals("A") ? "B" : "A")
                .collect(Collectors.joining()).contains(pat) ? 1 : 0;
    }
}
