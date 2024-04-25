/**
 * title : 문자열 정렬하기 (1)
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortString1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Arrays.toString(solution(br.readLine())));

        bw.close();
        br.close();
    }

    public static int[] solution(String string) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (Character.isDigit(character)) {
                list.add(Character.getNumericValue(character));
            }
        }

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
