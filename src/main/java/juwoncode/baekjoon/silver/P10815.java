/**
 * no          : 10815
 * title       : 숫자 카드
 * description : 상근이는 N개의 숫자 카드 패를 갖고 있다. M개의 숫자 카드 패가 주어질 때, 상근이가 갖고 있으면 1을 아니면 0을 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.util.*;

public class P10815 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int handCount = scanner.nextInt();
        Set<Integer> handCards = new HashSet<>();
        for (int i = 0; i < handCount; i++) {
            handCards.add(scanner.nextInt());
        }

        int checkCount = scanner.nextInt();
        for (int i = 0; i < checkCount; i++) {
            int card = scanner.nextInt();
            System.out.print((handCards.contains(card) ? 1 : 0) + " ");
        }
        scanner.close();
    }
}
