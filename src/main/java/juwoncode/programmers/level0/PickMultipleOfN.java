/**
 * title : n의 배수 고르기
 */

package juwoncode.programmers.level0;

import java.util.*;

public class PickMultipleOfN {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(solution(5, new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(solution(12, new int[]{2, 100, 120, 600, 12, 12})));
    }

    public static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                list.add(num);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
