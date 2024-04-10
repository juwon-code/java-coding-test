/**
 * title : 문자열 섞기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class MixString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        bw.write(solution(str1, str2));

        br.close();
        bw.close();
    }

    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int count = str1.length();

        for (int i = 0; i < count; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }

        return sb.toString();
    }
}
