/**
 * title : 소수 찾기
 */

package juwoncode.programmers.level1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextInt()));

        sc.close();
    }

    public static int solution(int number) {
        boolean[] isPrime = new boolean[number + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= number; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return (int) IntStream.rangeClosed(0, number)
                .filter(i -> isPrime[i])
                .count();
    }
}
