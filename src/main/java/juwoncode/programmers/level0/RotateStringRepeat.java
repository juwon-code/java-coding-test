/**
 * title : 문자열 여러번 뒤집기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class RotateStringRepeat {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = "rermgorpsam";
        int[][] queries = new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        bw.write(solution(string, queries));

        bw.close();
    }

    public static String solution(String string, int[][] queries) {
        StringBuilder sb = new StringBuilder(string);

        for (int[] query : queries) {
            int start = query[0];
            int last = query[1] + 1;
            sb.replace(start, last, rotate(sb.substring(start, last)));
        }

        return sb.toString();
    }

    public static String rotate(String string) {
        char[] array = string.toCharArray();
        int length = array.length - 1;

        for (int i = 0; i < length; i++) {
            char temp = array[i];
            array[i] = array[length];
            array[length] = temp;
            length--;
        }

        return new String(array);
    }
}
