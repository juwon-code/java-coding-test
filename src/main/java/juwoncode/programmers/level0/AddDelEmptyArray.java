/**
 * title : 빈 배열에 추가 삭제하기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class AddDelEmptyArray {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[]{3, 2, 4, 1, 3};
        boolean[] flags = new boolean[]{true, false, true, false, false};
        bw.write(Arrays.toString(solution(array, flags)));

        bw.close();
    }

    public static int[] solution(int[] array, boolean[] flags) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (flags[i]) {
                for (int j = 0; j < array[i] * 2; j++) {
                    stack.push(array[i]);
                }
            } else {
                for (int j = 0; j < array[i]; j++) {
                    stack.pop();
                }
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
