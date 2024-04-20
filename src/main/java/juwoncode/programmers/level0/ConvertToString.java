/**
 * title : 문자열로 변환
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ConvertToString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(Integer.parseInt(br.readLine())));

        bw.close();
        br.close();
    }

    public static String solution(int n) {
        return String.valueOf(n);
    }
}
