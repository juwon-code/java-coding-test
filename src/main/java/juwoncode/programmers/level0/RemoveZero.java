/**
 * title : 0 떼기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class RemoveZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine()));

        bw.close();
        br.close();
    }

    public static String solution(String string) {
        return string.replaceFirst("^0+", "");
    }
}
