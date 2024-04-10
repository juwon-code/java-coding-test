/**
 * title : 두 수의 연산값 비교하기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class CompareOperationResult {
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
        int numberA = Integer.parseInt(a + String.valueOf(b));
        int numberB = 2 * a * b;

        return Math.max(numberA, numberB);
    }
}
