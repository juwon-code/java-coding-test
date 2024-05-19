/**
 * title : N개의 최소공배수
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.Arrays;

public class GCDOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(array)));

        bw.close();
        br.close();
    }

    public static int solution(int[] array) {
        int lcm = 0;

        for (int i = 0; i < array.length; i++) {
            if (lcm == 0) {
                lcm = array[i] * array[i + 1] / gcd(Math.max(array[i], array[i + 1]), Math.min(array[i], array[i + 1]));
                i++;
            } else {
                lcm = lcm * array[i] / gcd(Math.max(array[i], lcm), Math.min(array[i], lcm));
            }
        }

        return lcm;
    }

    private static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return gcd(number2, number1 % number2);
        }
    }
}
