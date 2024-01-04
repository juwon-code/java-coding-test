/**
 * no          : 2720
 * title       : 세탁소 사장 동혁
 * description : 거스름돈이 주어질 때, 쿼터,
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double QUARTER = 25;
        final double DIME = 10;
        final double NICKEL = 5;
        final double PENNY = 1;

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            double money = scanner.nextDouble();
            int[] result = new int[4];
            while (money > 0) {
                if (money >= QUARTER) {
                    money -= QUARTER;
                    result[0]++;
                } else if (money >= DIME) {
                    money -= DIME;
                    result[1]++;
                } else if (money >= NICKEL) {
                    money -= NICKEL;
                    result[2]++;
                } else {
                    money -= PENNY;
                    result[3]++;
                }
            }
            System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
        }

        scanner.close();
    }
}
