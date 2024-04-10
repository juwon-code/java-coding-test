/**
 * title : 등차수열의 특정한 항만 더하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class AdditionSpecificTermInArithmeticSequence {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a1 = 3;
        int d1 = 4;
        boolean[] inc1 = new boolean[]{true, false, false, true, true};
        bw.write(String.valueOf(solution(a1, d1, inc1)));
        bw.write("\n");

        int a2 = 7;
        int d2 = 1;
        boolean[] inc2 = new boolean[]{false, false, false, true, false, false, false};
        bw.write(String.valueOf(solution(a2, d2, inc2)));
        bw.close();
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + i * d;
            }
        }

        return answer;
    }
}
