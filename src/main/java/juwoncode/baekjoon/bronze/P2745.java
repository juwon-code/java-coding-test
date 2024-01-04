/**
 * no          : 2745
 * title       : 진법 변환
 * description : B진법의 수 N이 주어질 때, 10진법으로 변환하고 출력하시오.
 */


package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2745 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] strings = scanner.next().split("");
        int base = scanner.nextInt();

        int length = strings.length - 1;
        int result = 0;
        for (String string : strings) {
            if (alphabets.contains(string)) {
                result += (alphabets.indexOf(string) + 10) * Math.pow(base, length);
            } else {
                result += Integer.parseInt(string) * Math.pow(base, length);
            }
            length--;
        }

        System.out.print(result);
        scanner.close();
    }
}
