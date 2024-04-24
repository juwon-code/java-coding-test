/**
 * title : 문자열 뒤집기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class FlipString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        bw.write(solution(string, start, end));

        bw.close();
        br.close();
    }

    public static String solution(String string, int start, int end) {
        String[] strings = string.split("");

        while (start <= end) {
            String temp = strings[start];
            strings[start] = strings[end];
            strings[end] = temp;
            start++;
            end--;
        }

        return String.join("", strings);
    }

    public static String solution(String string) {
        StringBuilder sb = new StringBuilder(string);

        return sb.reverse().toString();
    }
}
