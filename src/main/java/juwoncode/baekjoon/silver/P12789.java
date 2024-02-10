/**
 * no          : 12789
 * title       : 도키도키 간식드리미
 * description : 문제 참조.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class P12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();

        while (st.hasMoreTokens()) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> stack = new Stack<>();
        int number = 1;
        while (!queue.isEmpty()) {
            if(queue.peek() == number) {
                queue.poll();
                number++;
            } else if (!stack.isEmpty() && stack.peek() == number) {
                stack.pop();
                number++;
            } else {
                stack.push(queue.poll());
            }
        }
        while (!stack.empty()) {
            if (stack.peek() == number) {
                stack.pop();
                number++;
            } else {
                break;
            }
        }

        bw.write(stack.isEmpty() ? "Nice" : "Sad");
        bw.close();
        br.close();
    }
}
