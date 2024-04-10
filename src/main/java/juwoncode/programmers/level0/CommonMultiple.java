/**
 * title : 공배수
 */

package juwoncode.programmers.level0;

import java.io.*;

public class CommonMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(number, n, m)));

        bw.close();
        bw.close();
    }

    public static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
