/**
 * no          : 10773
 * title       : 제로
 * description : 수가 K개 주어지며 총합을 출력하시오. 단, 0일 경우 최근 숫자를 제거한다.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int command = Integer.parseInt(br.readLine());

            if (command == 0) {
                stack.pop();
                continue;
            }

            stack.push(command);
        }

        int result = 0;
        while (!stack.empty()) {
            result += stack.pop();
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }
}
