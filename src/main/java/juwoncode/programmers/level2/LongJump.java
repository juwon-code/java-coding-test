/**
 * title : 멀리 뛰기
 */

package juwoncode.programmers.level2;

import java.util.Scanner;

public class LongJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextInt()));

        sc.close();
    }

    public static long solution(int n) {
        long[] array = new long[2001];
        array[1] = 1;
        array[2] = 2;

        for (int i = 3; i <= n; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }

        return array[n];
    }
}
