/**
 * no          : 2480
 * title       : 주사위 세개
 * description : 주사위 세 개를 던져서 다음 규칙에 따라 상금을 출력하라.
 *      (1) 같은 눈이 3개일 경우, 10000원 + (같은 눈) * 1000원
 *      (2) 같은 눈이 2개일 경우, 1000원 + (같은 눈) * 100원
 *      (3) 모두 다른 눈일 경우, (가장 큰 눈) * 100원
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        if (dice1 == dice2) {
            System.out.print((dice2 == dice3) ? (10000 + dice1 * 1000) : (1000 + dice1 * 100));
        } else {
            System.out.print((dice1 == dice3 || dice2 == dice3) ? (1000 + dice3 * 100) : Math.max(dice1, Math.max(dice2, dice3)) * 100);
        }

        scanner.close();
    }
}
