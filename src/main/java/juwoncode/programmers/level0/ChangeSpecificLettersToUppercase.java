/**
 * title : 특정 문자를 대문자로 바꾸기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ChangeSpecificLettersToUppercase {
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
        return string.replaceAll(letter, letter.toUpperCase());
    }
}
