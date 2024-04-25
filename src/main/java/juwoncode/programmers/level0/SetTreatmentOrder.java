/**
 * title : 진료 순서 정하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class SetTreatmentOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] emergency = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(emergency)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int order = length;
            for (int value : emergency) {
                if (emergency[i] > value) {
                    order--;
                }
            }
            result[i] = order;
        }

        return result;
    }
}
