/**
 * title : 음양 더하기
 */

package juwoncode.programmers.level1;

public class SumYinYang {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int result = 0;

        for (int i = 0; i < signs.length; i++) {
            result += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return result;
    }
}
