/**
 * title : 직사각형 넓이 구하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class FindRectangleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] dots = new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        bw.write(String.valueOf(solution(dots)));

        bw.close();
        br.close();
    }

    public static int solution(int[][] dots) {
        int xMin = 256, xMax = -256, yMin = 256, yMax = -256;

        for (int i = 0; i < 4; i++) {
            xMin = Math.min(xMin, dots[i][0]);
            xMax = Math.max(xMax, dots[i][0]);
            yMin = Math.min(yMin, dots[i][1]);
            yMax = Math.max(yMax, dots[i][1]);
        }

        return (xMax - xMin) * (yMax - yMin);
    }
}
