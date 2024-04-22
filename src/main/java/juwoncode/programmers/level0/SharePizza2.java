/**
 * title : 피자 나눠 먹기 (2)
 */

package juwoncode.programmers.level0;

import java.io.*;

public class SharePizza2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(n)));

        bw.close();
        br.close();
    }

    public static int solution(int n) {
        int div = (n > 6) ? gcd(n, 6) : gcd(6, n);
        return n / div;
    }

    public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return gcd(number2, number1 % number2);
        }
    }
}
