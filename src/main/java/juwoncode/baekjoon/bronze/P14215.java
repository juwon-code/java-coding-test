/**
 * no          : 14215
 * title       : 세 막대
 * description : 길이가 a, b, c인 막대가 주어지고, 막대의 길이를 조절할 수 있을 때 만들 수 있는 가장 큰 삼각형의 둘레를 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P14215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sticks = new int[3];
        int max = 0, index = 0;
        for (int i = 0; i < sticks.length; i++) {
            sticks[i] = scanner.nextInt();
            if (sticks[i] > max) {
                max = sticks[i];
                index = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < sticks.length; i++) {
            if (i == index) {
                continue;
            }
            sum += sticks[i];
        }

        if (sum > max) {
            System.out.print(max + sum);
        } else {
            System.out.print(sum * 2 - 1);
        }

        scanner.close();
    }
}
