/**
 * no          : 25304
 * title       : 영수증
 * description : 영수증의 금액과 구입 횟수, 물건의 가격, 개수가 주어질 때, 영수증과 일치하면 "Yes" 아니면 "No"를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int count = scanner.nextInt();
        int _total = 0;

        for (int i = 0; i < count; i++) {
            int price = scanner.nextInt();
            int each = scanner.nextInt();
            _total += price * each;
        }

        System.out.print((total == _total) ? "Yes" : "No");
        scanner.close();
    }
}
