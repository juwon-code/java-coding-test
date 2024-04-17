/**
 * title : 배열 조각하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class CarveArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = convertStringToIntegerArray(br.readLine());
        int[] query = convertStringToIntegerArray(br.readLine());
        bw.write(Arrays.toString(solution(array, query)));

        bw.close();
        br.close();
    }

    public static int[] convertStringToIntegerArray(String string) {
        return Arrays.stream(string.split(", "))
                .mapToInt(Integer::parseInt).toArray();
    }

    public static int[] solution(int[] array, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                array = Arrays.copyOfRange(array, 0, query[i] + 1);
            } else {
                array = Arrays.copyOfRange(array, query[i], array.length);
            }
        }

        return array;
    }
}
