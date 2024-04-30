/**
 * title : 최대 공약수와 최소 공배수
 */

package juwoncode.programmers.level1;

import java.util.Arrays;
import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(Arrays.toString(solution(sc.nextInt(), sc.nextInt())));

        sc.close();
    }

    public static int[] solution(int number1, int number2) {
        int minimum = number1, maximum = number2;

        if (number1 > number2) {
            maximum = number1;
            minimum = number2;
        }

        int gcd = gcd(maximum, minimum);
        int lcm = minimum * maximum / gcd;

        return new int[]{gcd, lcm};
    }

    public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return gcd(number2, number1 % number2);
    }
}
