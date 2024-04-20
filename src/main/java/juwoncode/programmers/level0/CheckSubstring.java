/**
 * title : 부분 문자열인지 확인하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class CheckSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        String target = br.readLine();
        bw.write(String.valueOf(solution(string, target)));

        bw.close();
        br.close();
    }

    public static int solution(String string, String target) {
        return string.contains(target) ? 1 : 0;
    }
}
