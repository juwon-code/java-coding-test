/**
 * title : 3진법 뒤집기
 */

package juwoncode.programmers.level1;

import java.util.Scanner;

public class TernaryReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextInt()));

        sc.close();
    }

    public static int solution(int number) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int temp = number % 3;
            sb.append(temp);
            number /= 3;
        }

        String[] ternary = sb.reverse().toString().split("");
        int decimal = 0;

        for (int i = 0; i < ternary.length; i++) {
            decimal += Integer.parseInt(ternary[i]) * Math.pow(3, i);
        }

        return decimal;
    }
}
