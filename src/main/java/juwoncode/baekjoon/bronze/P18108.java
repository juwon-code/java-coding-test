/**
 * no          : 18108
 * title       : 1998년생인 내가 태국에서는 2541년생?!
 * description : 태국에서 사용하는 불기연도가 입력으로 주어진다. 서기 연도로 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;

public class P18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        System.out.print(year - 543);
        scanner.close();
    }
}
