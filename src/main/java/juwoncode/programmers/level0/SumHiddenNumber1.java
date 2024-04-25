/**
 * title : 숨어있는 숫자의 덧셈 (1)
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.stream.IntStream;

public class SumHiddenNumber1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(solution(br.readLine())));

        bw.close();
        br.close();
    }

    public static int solution(String string) {
        return IntStream.range(0, string.length())
                .filter(i -> Character.isDigit(string.charAt(i)))
                .map(i -> Character.getNumericValue(string.charAt(i)))
                .sum();
    }
}
