/**
 * title : 배열 만들기 6
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class MakeArray6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < array.length) {
            if (stack.isEmpty() || stack.lastElement() != array[i]) {
                stack.push(array[i]);
            } else {
                stack.pop();
            }
            i++;
        }

        return stack.isEmpty() ? new int[]{-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
