/**
 * no          : 9498
 * title       : 시험 성적
 * description : 시험 점수를 입력받고 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                System.out.print("A");
                break;
            case 8:
                System.out.print("B");
                break;
            case 7:
                System.out.print("C");
                break;
            case 6:
                System.out.print("D");
                break;
            default:
                System.out.print("F");
                break;
        }

        scanner.close();
    }
}
