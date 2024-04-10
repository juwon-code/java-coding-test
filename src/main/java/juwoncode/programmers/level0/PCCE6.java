/**
 * title : [PCCE 기출문제] 6번 / 가채점
 */

package juwoncode.programmers.level0;

import java.util.Arrays;

public class PCCE6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1}, new int[]{100}, new int[]{100, 80, 90, 84, 20})));
        System.out.println(Arrays.toString(solution(new int[]{3, 4}, new int[]{85, 93}, new int[]{85, 92, 38, 93, 48, 85, 92, 56})));
    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[--numbers[i]]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
