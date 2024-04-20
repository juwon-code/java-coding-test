/**
 * title : 부분 문자열
 */

package juwoncode.programmers.level0;

import java.io.*;

public class SubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string1 = br.readLine();
        String string2 = br.readLine();
        bw.write(String.valueOf(solution(string1, string2)));

        bw.close();
        br.close();
    }

    public static int solution(String string1, String string2) {
        return string2.contains(string1) ? 1 : 0;
    }
}
