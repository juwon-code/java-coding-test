/**
 * no          : 3052
 * title       : 나머지
 * description : 10개의 자연수를 입력받고 42로 나눈 나머지를 구한다. 중복하지 않은 수의 개수를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int COUNT = 10, DIVISOR = 42;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < COUNT; i++) {
            set.add(scanner.nextInt() % DIVISOR);
        }

        System.out.print(set.size());
        scanner.close();
    }
}
