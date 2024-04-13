/**
 * title : 부분 문자열 이어 붙여 문자열 만들기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SubstringAttach {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = new String[]{"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        bw.write(solution(strings, parts));

        bw.close();
    }

    public static String solution(String[] strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            String string = strings[i].substring(parts[i][0], parts[i][1] + 1);
            sb.append(string);
        }

        return sb.toString();
    }
}
