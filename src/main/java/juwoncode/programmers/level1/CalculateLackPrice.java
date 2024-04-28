/**
 * title : 부족한 금액 계산하기
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class CalculateLackPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int money = scanner.nextInt();
        int count = scanner.nextInt();
        System.out.print(solution(price, money, count));

        scanner.close();
    }

    public static long solution(int price, int money, int count) {
        long require = 0;

        for (int i = 1; i <= count; i++) {
            require += (long) price * i;
        }

        return require <= money ? 0 : require - money;
    }
}
