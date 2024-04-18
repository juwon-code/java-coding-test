/**
 * title : 특정 문자열로 끝나는 가장 긴 문자열
 */

package juwoncode.programmers.level0;

import java.io.*;

public class LongestStringEndWithString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        String pat = br.readLine();
        bw.write(solution(string, pat));

        bw.close();
        br.close();
    }

    public static String solution(String string, String pat) {
        return string.substring(0, string.lastIndexOf(pat) + pat.length());
    }
}
