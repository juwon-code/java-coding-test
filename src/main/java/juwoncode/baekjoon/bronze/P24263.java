/**
 * no          : 24263
 * title       : 알고리즘 수업 - 알고리즘의 수행 시간 2
 * description : 다음 알고리즘이 주어질 때, 수행횟수와 수행횟수를 다항식으로 나타낼 때 최고차수를 출력하라.
 *      MenOfPassion(A[], n) {
 *          sum <- 0;
 *          for i <- 1 to n
 *              sum <- sum + A[i];
 *          return sum;
 *      }
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P24263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(n + "\n" + 1);
        scanner.close();
    }
}
