/**
 * title : 배열 만들기 4
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class MakeArray4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[]{1, 4, 2, 5, 3};
        bw.write(Arrays.toString(solution(arr)));

        bw.close();
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                continue;
            }

            if (stack.peek() >= arr[i]) {
                stack.pop();
                i--;
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
