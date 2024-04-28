/**
 * title : 내적
 */

package juwoncode.programmers.level1;

public class DotProduct {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
        System.out.println(solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1}));
    }

    public static int solution(int[] array1, int[] array2) {
        int length = array1.length, result = 0;

        for (int i = 0; i < length; i++) {
            result += array1[i] * array2[i];
        }

        return result;
    }
}
