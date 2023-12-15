/**
 * no          : 2743
 * title       : 단어 길이 재기
 * description : 단어를 입력받고 길이를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P2743 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        System.out.print(string.length());
        scanner.close();
    }
}
