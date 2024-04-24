/**
 * title : 특정 문자 제거하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveCertainCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        String letter = br.readLine();
        bw.write(solution(string, letter));

        bw.close();
        br.close();
    }

    public static String solution(String string, String letter) {
        String[] strings = string.split("");

        return Arrays.stream(strings).filter(s -> !s.equals(letter)).collect(Collectors.joining());
    }
}
