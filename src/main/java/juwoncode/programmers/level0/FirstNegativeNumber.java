/**
 * title : 첫 번째로 나오는 음수
 */

package juwoncode.programmers.level0;

import java.util.stream.IntStream;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{12, 4, 15, 46, 38, -2, 15};
        int[] numbers2 = new int[]{13, 22, 53, 24, 15, 6};

        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }

    public static int solution(int[] numbers) {
        return IntStream.range(0, numbers.length).filter(i -> numbers[i] < 0).findFirst().orElse(-1);
    }
}
