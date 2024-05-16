/**
 * title : 이진 변환 계속하기
 */

package juwoncode.programmers.level2;

import java.util.Arrays;
import java.util.Scanner;

public class ContinueBinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(Arrays.toString(solution(sc.nextLine())));

        sc.close();
    }

    public static int[] solution(String string) {
        int[] result = new int[2];
        while (!string.equals("1")) {
            int beforeLength = string.length();
            // string의 0을 제거하기.
            string = string.replaceAll("0", "");
            // 제거한 0의 개수 갱신하기.
            int afterLength = string.length();
            result[1] += beforeLength - afterLength;
            // 다시 이진으로 변환하기.
            StringBuilder sb = new StringBuilder();
            while (afterLength >= 1) {
                sb.insert(0, afterLength % 2);
                afterLength /= 2;
            }
            // 다시 string에 집어넣고 횟수 증가.
            string = sb.toString();
            result[0]++;
        }

        return result;
    }
}
