/**
 * no          : 5073
 * title       : 삼각형과 세 변
 * description : 삼각형의 세 변의 길이가 주어질 때, 다음 조건에 따라 결과를 출력하시오.
 *      (1) Equilateral : 세 변의 길이가 모두 같은 경우
 *      (2) Isosceles   : 두 변의 길이만 같은 경우
 *      (3) Scalene     : 세 변의 길이가 모두 다른 경우
 *      (4) Invalid     : 위 조건에 맞지 않을 경우
 */

package juwoncode.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class P5073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] edges = {-1, -1, -1};

        while (true) {
            edges[0] = scanner.nextInt();
            edges[1] = scanner.nextInt();
            edges[2] = scanner.nextInt();

            if (edges[0] == 0 && edges[1] == 0 && edges[2] == 0) {
                break;
            }

            Arrays.sort(edges);

            if (edges[0] == edges[1] && edges[1] == edges[2]) {
                System.out.println("Equilateral");
                continue;
            }

            if (!(edges[2] < (edges[0] + edges[1]))) {
                System.out.println("Invalid");
                continue;
            }

            if (edges[0] == edges[1] || edges[0] == edges[2] || edges[1] == edges[2]) {
                System.out.println("Isosceles");
                continue;
            }

            System.out.println("Scalene");
        }

        scanner.close();
    }
}
