/**
 * title : rny_string
 */

package juwoncode.programmers.level0;

import java.io.*;

public class RNYString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine()));

        bw.close();
        br.close();
    }

    public static String solution(String string) {
        return string.replaceAll("m", "rn");
    }
}
