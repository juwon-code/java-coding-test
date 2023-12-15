/**
 * no          : 10813
 * title       : 공 바꾸기
 * description : 1 ~ N개의 바구니에 번호와 일치하는 공이 들어있다. M번에 걸쳐서 바꿀 바구니를 선택하고 공을 서로 교환하고 결과를 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int count = scanner.nextInt();
        int[] baskets = IntStream.rangeClosed(1, length).toArray();

        for (int i = 0; i < count; i++) {
            int index1 = scanner.nextInt() - 1;
            int index2 = scanner.nextInt() - 1;
            int temp = baskets[index1];
            baskets[index1] = baskets[index2];
            baskets[index2] = temp;
        }

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
        scanner.close();
    }
}
