/**
 * no          : 10101
 * title       : 삼각형 외우기
 * description : 세 각을 입력받고 다음 조건에 따라 출력하시오.
 *      세 각의 크기가 모두 60이면, Equilateral
 *      세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
 *      세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
 *      세 각의 합이 180이 아닌 경우에는 Error
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P10101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == angle2) {
                System.out.print((angle1 == angle3) ? "Equilateral" : "Isosceles");
            } else if (angle2 == angle3) {
                System.out.print("Isosceles");
            } else if (angle1 == angle3) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }

        scanner.close();
    }
}
