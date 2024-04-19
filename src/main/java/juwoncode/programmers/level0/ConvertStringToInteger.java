/**
 * title : 문자열을 정수로 변환하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class ConvertStringToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(solution(br.readLine())));
        bw.close();
        br.close();
    }

    public static int solution(String string) {
        return Integer.parseInt(string);
    }
}
