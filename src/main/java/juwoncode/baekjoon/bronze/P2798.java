/**
 * no          : 2798
 * title       : 블랙잭
 * description : N장의 숫자가 적혀있는 카드가 주어질 때, M을 넘지 않으면서 M에 최대한 가까운 카드의 합을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int limit = scanner.nextInt();
        Integer[] cards = new Integer[count];

        // 카드를 입력받는다.
        for (int i = 0; i < count; i++) {
            cards[i] = scanner.nextInt();
        }

        // 카드를 더해가며 값을 구한다.
        int value = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = i + 2; k < count; k++) {
                    if (cards[i] == cards[j] || cards[j] == cards[k]) {
                        continue;
                    }
                    int sum = cards[i] + cards[j] + cards[k];
                    if (limit >= sum && value < sum) {
                        value = sum;
                    }
                }
            }
        }

        // 값을 출력한다.
        System.out.print(value);
        scanner.close();
    }
}
