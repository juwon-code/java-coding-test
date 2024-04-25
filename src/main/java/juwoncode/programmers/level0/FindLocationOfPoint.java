/**
 * title : 점의 위치 구하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class FindLocationOfPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dots = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(dots)));

        bw.close();
        br.close();
    }

    public static int solution(int[] dots) {
        if (dots[0] > 0) {
            return dots[1] > 0 ? 1 : 4;
        } else {
            return dots[1] > 0 ? 2 : 3;
        }
    }
}
