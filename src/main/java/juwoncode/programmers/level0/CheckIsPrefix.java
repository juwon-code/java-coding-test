/**
 * title : 접두사인지 확인하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class CheckIsPrefix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        String check = br.readLine();
        bw.write(String.valueOf(solution(string, check)));

        bw.close();
        br.close();
    }

    public static int solution(String string, String check) {
        return string.startsWith(check) ? 1 : 0;
    }
}
