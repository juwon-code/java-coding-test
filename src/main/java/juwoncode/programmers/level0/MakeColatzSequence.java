/**
 * title : 콜라츠 수열 만들기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeColatzSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(n)));

        bw.close();
    }

    public static int[] solution(int n) {
        List<Integer> sequences = new ArrayList<>();
        sequences.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            sequences.add(n);
        }

        return sequences.stream().mapToInt(Integer::intValue).toArray();
    }
}
