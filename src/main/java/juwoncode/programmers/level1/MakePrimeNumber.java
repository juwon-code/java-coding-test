/**
 * title : 소수 만들기
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class MakePrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(numbers)));

        bw.close();
        br.close();
    }

    public static int solution(int[] numbers) {
        int length = numbers.length, count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (checkIsPrime(numbers[i] + numbers[j] + numbers[k])) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static boolean checkIsPrime(int number) {
        if (number < 4) {
            return true;
        }

        boolean result = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
