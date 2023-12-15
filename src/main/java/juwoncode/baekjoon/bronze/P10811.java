/**
 * no          : 10811
 * title       : 바구니 뒤집기
 * description : 1 ~ N개의 바구니에 번호와 일치하는 공이 들어있다. 바구니 범위를 M번 입력받아 바구니를 뒤집고 결과를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int count = scanner.nextInt();
        int[] baskets = IntStream.rangeClosed(1, length).toArray();

        for (int i = 0; i < count; i++) {
            int index1 = scanner.nextInt() - 1;
            int index2 = scanner.nextInt() - 1;
            if (index1 > index2) {
                int temp = index1;
                index1 = index2;
                index2 = temp;
            }
            for (int j = index1; j <= index2; j++) {
                int temp = baskets[j];
                baskets[j] = baskets[index2];
                baskets[index2] = temp;
                index2--;
            }
        }

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
        scanner.close();
    }
}
