/**
 * title : 글자 지우기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class EraseCharacter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = "apporoograpemmemprs";
        int[] indices = new int[]{1, 16, 6, 15, 0, 10, 11, 3};
        bw.write(solution(string, indices));

        bw.close();
    }

    public static String solution(String string, int[] indices) {
        String[] strings = string.split("");

        Arrays.stream(indices).forEach(i -> strings[i] = "");

        return String.join("", strings);
    }
}
