/**
 * title : 연속 부분 수열 합의 개수
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.*;

public class SumOfSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] elements = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(elements)));

        bw.close();
        br.close();
    }

    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int length = elements.length;

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = 0;
                for (int k = j; k < i + j; k++) {
                    sum += elements[k % length];
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}
