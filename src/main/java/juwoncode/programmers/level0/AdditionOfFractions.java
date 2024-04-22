/**
 * title : 분수의 덧셈
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;

public class AdditionOfFractions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputs = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(inputs[0], inputs[1], inputs[2], inputs[3])));

        bw.close();
        br.close();
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int divisor = gcd(Math.max(numer, denom), Math.min(numer, denom));

        return new int[]{numer / divisor, denom / divisor};
    }

    public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return gcd(number2, number1 % number2);
        }
    }
}
