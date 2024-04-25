/**
 * title : 구슬을 나누는 경우의 수
 */

package juwoncode.programmers.level0;

import java.io.*;

public class CasesOfMarbleDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine()), share = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(count, share)));

        bw.close();
        br.close();
    }

    public static int solution(int count, int share) {
        return combination(count, share);
    }

    private static int combination(int count, int share) {
        if (count == share || share == 0) {
            return 1;
        }

        return combination(count - 1, share - 1) + combination(count - 1, share);
    }
}
