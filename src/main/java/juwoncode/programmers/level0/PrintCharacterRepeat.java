/**
 * title : 문자 반복 출력하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class PrintCharacterRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int repeat = Integer.parseInt(br.readLine());
        bw.write(solution(string, repeat));

        bw.close();
        br.close();
    }

    public static String solution(String string, int repeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            sb.append(String.valueOf(string.charAt(i)).repeat(Math.max(0, repeat)));
        }

        return sb.toString();
    }
}
