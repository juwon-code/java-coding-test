/**
 * title : 문자열 곱하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class MultiplyString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int count = Integer.parseInt(br.readLine());

        bw.write(solution(string, count));
        bw.close();
        br.close();
    }

    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
