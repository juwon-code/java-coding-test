/**
 * title : 배열에서 문자열 대소문자 변환하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class ChangeCaseInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = Arrays.stream(br.readLine().split(", ")).toArray(String[]::new);
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static String[] solution(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i % 2 == 0) ? array[i].toLowerCase() : array[i].toUpperCase();
        }

        return array;
    }
}
