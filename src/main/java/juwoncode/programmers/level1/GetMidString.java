/**
 * title : 가운데 글자 가져오기
 */

package juwoncode.programmers.level1;

import java.io.*;

public class GetMidString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine()));

        bw.close();
        br.close();
    }

    public static String solution(String string) {
        int length = string.length();

        if (length % 2 == 0) {
            return string.substring(length / 2 - 1, length / 2 + 1);
        }

        return string.substring(length / 2, length / 2 + 1);
    }
}
