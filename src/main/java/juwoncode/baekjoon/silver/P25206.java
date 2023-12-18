/**
 * no          : 25206
 * title       : 너의 평점은
 * description : 과목명, 학점, 등급이 주어질 때, 전공 평점을 계산하여 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.util.Map;
import java.util.Scanner;

public class P25206 {
    public static void main(String[] args) {
        Map<String, Double> GRADES = Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        );

        Scanner scanner = new Scanner(System.in);

        int count = 20;
        double dividend = 0, divisor = 0;
        for (int i = 0; i < count; i++) {
            String subject = scanner.next();
            double score = scanner.nextDouble();
            String grade = scanner.next();

            if (grade.equals("P")) {
                continue;
            }

            dividend += score * GRADES.get(grade);
            divisor+= score;
        }

        System.out.print(dividend / divisor);
        scanner.close();
    }
}
