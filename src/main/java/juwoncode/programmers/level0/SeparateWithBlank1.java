/**
 * title : 공백으로 구분하기 1
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class SeparateWithBlank1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Arrays.toString(solution(br.readLine())));
        bw.close();
        br.close();
    }

    public static String[] solution(String string) {
        return string.split(" ");
    }
}
