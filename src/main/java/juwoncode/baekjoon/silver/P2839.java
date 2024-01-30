/**
 * no          : 2839
 * title       : 설탕 배달
 * description : 3킬로그램 봉지와 5 킬로그램 봉지가 있고, 설탕 무게 N이 주어진다. 설탕 무게를 정확하게 맞추어
 *      봉지를 가져가야 할 때, 봉지 개수의 최소값을 구하시오.
 */

package juwoncode.baekjoon.silver;

import java.util.Scanner;

public class P2839 {
    private static final int BIG_BAGS = 5;
    private static final int SMALL_BAGS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sugars = scanner.nextInt();

        System.out.print(check(sugars));

        scanner.close();
    }

    private static int check(int sugars) {
        // 경우 1) 큰 가방만 챙김
        if (sugars % BIG_BAGS == 0) {
            return sugars / BIG_BAGS;
        }

        // 경우 2) 작은 가방만 챙김
        if (sugars < 15 && sugars % SMALL_BAGS == 0) {
            return sugars / SMALL_BAGS;
        }
        
        // 경우 3) 큰 가방 + 작은 가방
        int result = -1, count = sugars / BIG_BAGS;
        int remains = sugars % BIG_BAGS;
        while (count > 0) {
            if (remains % SMALL_BAGS == 0) {
                result = count + remains / SMALL_BAGS;
                break;
            }
            remains += BIG_BAGS;
            count--;
        }

        return result;
    }
}
