/**
 * title : [PCCE 기출문제] 5번 / 산책
 */

package juwoncode.programmers.level0;

import java.util.Arrays;

public class PCCE5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("NSSNEWWN")));
        System.out.println(Arrays.toString(solution("EESEEWNWSNWWNS")));
    }

    private static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
