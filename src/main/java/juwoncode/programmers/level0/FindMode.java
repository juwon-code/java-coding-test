/**
 * title : 최빈값 구하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        int max = 0, result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if (count > max) {
                max = count;
                result = number;
            } else if (count == max) {
                result = -1;
            }

            map.put(number, count);
        }

        return result;
    }
}
