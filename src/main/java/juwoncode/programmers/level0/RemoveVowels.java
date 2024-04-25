/**
 * title : 모음 제거
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveVowels {
    private final static String VOWELS = "aeiou";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine()));

        bw.close();
        br.close();
    }

    public static String solution(String string) {
        String[] array = string.split("");

        return Arrays.stream(array)
                .filter(s -> !VOWELS.contains(s))
                .collect(Collectors.joining());
    }
}
