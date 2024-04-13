/**
 * title : 문자열 뒤의 n글자
 */

package juwoncode.programmers.level0;

import java.io.*;

public class NCharacterAfterString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int length = Integer.parseInt(br.readLine());
        bw.write(solution(string, length));

        bw.close();
    }

    public static String solution(String string, int length) {
        int stringLength = string.length();
        return string.substring(stringLength - length, stringLength);
    }
}
