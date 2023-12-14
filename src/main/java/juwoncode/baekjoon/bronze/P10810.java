/**
 * no          : 10810
 * title       : 공 넣기
 * description : 1 ~ N개의 바구니가 존재할 때, 1 ~ N개의 공을 집어넣는다.
 *      공은 중복될 수 없으며, 다른 숫자의 공은 이전 공을 덮어씌운다. 각 바구니에 담긴 공의 번호를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] baskets = new int[scanner.nextInt()];
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int start = scanner.nextInt();
            int last = scanner.nextInt();
            int number = scanner.nextInt();
            for (int j = start-1; j < last; j++) {
                baskets[j] = number;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int basket : baskets) {
            sb.append(basket + " ");
        }
        sb.trimToSize();

        System.out.print(sb);
    }
}
