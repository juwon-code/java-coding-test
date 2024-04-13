/**
 * title : 배열 만들기 5
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = new String[]{"0123456789", "9876543210", "9999999999999"};
        int standard = 50000, start = 5, length = 5;
        bw.write(Arrays.toString(solution(strings, standard, start, length)));

        bw.close();
    }

    public static int[] solution(String[] strings, int standard, int start, int length) {
        List<Integer> list = new ArrayList<>();

        for (String string : strings) {
            int number = Integer.parseInt(string.substring(start, start + length));

            if (standard < number) {
                list.add(number);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
