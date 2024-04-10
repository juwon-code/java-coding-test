/**
 * title : 문자열 겹쳐쓰기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class OverwriteString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String originalString = br.readLine();
        String overwriteString = br.readLine();
        int startIndex = Integer.parseInt(br.readLine());

        bw.write(solution(originalString, overwriteString, startIndex));

        br.close();
        bw.close();
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}
