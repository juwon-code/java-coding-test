/**
 * no          : 2292
 * title       : 벌집
 * description : 육각형으로 이루어진 벌집이 있고 자연수 N이 주어진다. 중앙 방으로부터의 거리를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int count = 1, rooms = 1;
        while (true) {
            rooms += (count - 1) * 6;
            if (rooms >= number) {
                break;
            }
            count++;
        }

        System.out.print(count);
        scanner.close();
    }
}
