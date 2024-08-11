/*
    title : 삼각형의 완성조건(1)
 */

package juwoncode.programmers.level0;

import java.util.Arrays;

public class ConditionForTriangle1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 6, 2}));
        System.out.println(solution(new int[]{199, 72, 222}));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
