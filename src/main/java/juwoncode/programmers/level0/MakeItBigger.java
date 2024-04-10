/**
 * title : 더 크게 합치기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class MakeItBigger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(a, b)));

        bw.close();
        br.close();
    }

    public static int solution(int a, int b) {
        int resultA = Integer.parseInt(String.format("%d%d", a, b));
        int resultB = Integer.parseInt(String.format("%d%d", b, a));

        return Math.max(resultA, resultB);
    }
}
