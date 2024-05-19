/**
 * title : 예상 대진표
 */

package juwoncode.programmers.level2;

import java.io.*;

public class ExpectedTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(count, a, b)));

        bw.close();
        br.close();
    }

    public static int solution(int count, int a, int b) {
        int result = 0;

        while (true) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            result++;
            if (a == b) {
                break;
            }
        }

        return result;
    }
}
