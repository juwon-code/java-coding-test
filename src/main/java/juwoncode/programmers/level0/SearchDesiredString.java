/**
 * title : 원하는 문자열 찾기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class SearchDesiredString {
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
        string = string.toUpperCase();
        pat = pat.toUpperCase();

        return string.contains(pat) ? 1 : 0;
    }
}
