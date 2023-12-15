/**
 * no          : 5597
 * title       : 과제 안 내신 분..?
 * description : 1번부터 30번까지 출석번호를 갖는 학생이 30명 있다. 제출자 번호를 28개 입력받고, 안 낸 출석번호를 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students = new int[30];
        final int COUNT = 28;

        for (int i = 0; i < COUNT; i++) {
            students[scanner.nextInt() - 1]++;
        }

        IntStream.rangeClosed(1, students.length)
                .filter(i -> students[i - 1] == 0)
                .forEach(System.out::println);
        scanner.close();
    }
}
