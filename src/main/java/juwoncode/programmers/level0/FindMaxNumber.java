/**
 * title : 가장 큰 수 찾기
 */

package juwoncode.programmers.level0;

import java.util.Arrays;

public class FindMaxNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
