/**
 * no          : 2525
 * title       : 오븐시계
 * description : 현재 시간(A, 0 <= A <= 23)과 분(B, 0 <= B <= 59), 소요 시간을 분단위(C, 0 <= C <= 59)로 받는다.
 *      C분 이후의 시간을 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int remain = scanner.nextInt();

        minute += remain;
        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }
        if (hour >= 24) {
            hour %= 24;
        }

        System.out.print(hour + " " + minute);
        scanner.close();
    }
}
