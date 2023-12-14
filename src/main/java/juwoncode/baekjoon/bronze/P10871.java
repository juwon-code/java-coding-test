/**
 * no          : 10871
 * title       : X보다 작은 수
 * description : N개의 정수로 이루어진 수열 A가 주어졌을 때, X보다 작은 수를 모두 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int standard = scanner.nextInt();
        List<String> list = new ArrayList();

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (number < standard) {
                list.add(String.valueOf(number));
            }
        }

        String result = String.join(" ", list);
        System.out.print(result);
        scanner.close();
    }
}
