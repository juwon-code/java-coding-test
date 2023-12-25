/**
 * no          : 15894
 * title       : 수학은 체육과목 입니다
 * description : 한 변의 길이가 1인 정사각형을 붙여나간다. 가장 아랫부분의 정사각형 개수가 주어질 때, 도형의 둘레를 구하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P15894 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long count = scanner.nextLong() * 4;

        System.out.print(count);
        scanner.close();
    }
}
