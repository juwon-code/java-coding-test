/**
 * title : n의 배수
 */

package juwoncode.programmers.level0;

import java.io.*;

public class MultipleOfN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(num, n)));

        bw.close();
        br.close();
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
