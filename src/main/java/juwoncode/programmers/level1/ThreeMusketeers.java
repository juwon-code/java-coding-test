/**
 * title : 삼총사
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class ThreeMusketeers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        int count = 0, length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int h = j + 1; h < length; h++) {
                    int sum = array[i] + array[j] + array[h];
                    if (sum == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
