/**
 * title : 조건에 맞게 수열 변환하기 1
 */

package juwoncode.programmers.level0;

import java.util.Arrays;

public class ConvertSequenceByCondition1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(solution(array)));
    }

    public static int[] solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 50) {
                if (array[i] % 2 == 0) {
                    array[i] /= 2;
                }
            } else if (array[i] % 2 != 0) {
                array[i] *= 2;
            }
        }

        return array;
    }
}
