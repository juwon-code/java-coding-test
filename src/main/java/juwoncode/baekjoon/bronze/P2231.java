/**
 * no          : 2231
 * title       : 분해합
 * description : 어떤 자연수 N이 주어질 때, 분해합이 되는 수를 생성자라고 한다. 가장 작은 생성자를 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            int sum = i + Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
            if (n == sum) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.print(0);
        } else {
            System.out.print(result.get(result.size() - 1));
        }
        scanner.close();
    }
}
