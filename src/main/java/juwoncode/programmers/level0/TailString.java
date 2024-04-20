/**
 * title : 꼬리 문자열
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TailString {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = new String[]{"abc", "def", "ghi"};
        String exclusion = "ef";

        bw.write(solution(array, exclusion));
        bw.close();
    }

    public static String solution(String[] array, String exclusion) {
        StringBuilder sb = new StringBuilder();

        for (String string : array) {
            if (!string.contains(exclusion)) {
                sb.append(string);
            }
        }

        return sb.toString();
    }
}
