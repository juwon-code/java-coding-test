/**
 * title : 구명보트
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.Arrays;

public class RescueBoat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] weights = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int limit = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(weights, limit)));

        bw.close();
        br.close();
    }

    public static int solution(int[] weights, int limit) {
        int length = weights.length, result = 0;
        Arrays.sort(weights);

        int i = 0;
        for (int j = length - 1; j >= i; j--) {
            if (weights[i] + weights[j] <= limit) {
                i++;
            }
            result++;
        }

        return result;
    }
}
