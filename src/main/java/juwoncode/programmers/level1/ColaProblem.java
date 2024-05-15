/**
 * title : 콜라 문제
 */

package juwoncode.programmers.level1;

import java.io.*;

public class ColaProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(a, b, c)));

        bw.close();
        br.close();
    }

    public static int solution(int a, int b, int n) {
        int result = 0;

        while (n >= a) {
            result += n / a * b;
            n = n / a * b + n % a;
        }

        return result;
    }
}
