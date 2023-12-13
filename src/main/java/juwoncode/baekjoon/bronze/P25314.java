/**
 * no          : 25314
 * title       : 코딩은 체육과목 입니다
 * description : n바이트가 입력으로 주어진다. int에 long을 붙일 때마다 4바이트씩 용량이 늘어난다고 가정하고 최종 식별자를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = scanner.nextDouble() / 4;
        StringBuilder sb = new StringBuilder("int");
        for (int i = 0; i < count; i++) {
            sb.insert(0, "long ");
        }

        System.out.print(sb);
        scanner.close();
    }
}
