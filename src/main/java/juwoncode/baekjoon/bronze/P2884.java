/**
 * no          : 2884
 * title       : 알람 시계
 * description : 시간(H, 0 <= H <= 23)과 분(0 <= M <= 59)을 정수로 받을 때, 45분 앞서는 시간을 출력하라.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute < 45) {
            hour = (hour == 0) ? 23 : --hour;
            minute = 60 + (minute - 45);
        } else {
            minute -= 45;
        }

        System.out.print(hour + " " + minute);
        scanner.close();
    }
}
