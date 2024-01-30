/**
 * no          : 14425
 * title       : 문자열 집합
 * description : N개의 문자열로 이루어진 집합 S가 주어질 때, M개의 문자열 중 S에 포함되어 있는 문자열의 개수를 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.util.*;

public class P14425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.next(), 0);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(scanner.next())) {
                count++;
            }
        }

        System.out.print(count);
        scanner.close();
    }
}
