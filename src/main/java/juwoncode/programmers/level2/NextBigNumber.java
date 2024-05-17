/**
 * title : 다음 큰 숫자
 */

package juwoncode.programmers.level2;

import java.util.Scanner;

public class NextBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextInt()));

        sc.close();
    }

    public static int solution(int number) {
        String binaryString = Integer.toBinaryString(number);
        int originCount = count(binaryString), result = number + 1;

        while (true) {
            binaryString = Integer.toBinaryString(result);
            int newCount = count(binaryString);
            if (originCount == newCount) {
                break;
            }
            result++;
        }

        return result;
    }

    private static int count(String binaryString) {
        char[] array = binaryString.toCharArray();
        int count = 0;

        for (char number : array) {
            if (number == '1') {
                count++;
            }
        }

        return count;
    }

/*
    시간초과로 인해 폐기한 코드.
    public static int solution(int number) {
        String binaryString = toBinaryString(number);
        int originCount = countBinaryString(binaryString);

        int result = number + 1;
        while (true) {
            binaryString = toBinaryString(result);
            int newCount = countBinaryString(binaryString);

            if (originCount == newCount) {
                break;
            }

            result++;
        }

        return result;
    }

    private static int countBinaryString(String binaryString) {
        int count = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }

    private static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();

        while (number >= 1) {
            sb.insert(0, number % 2);
            number /= 2;
        }

        return sb.toString();
    }
*/
}
