/**
 * no          : 28278
 * title       : 스택 2
 * description : 정수를 저장하는 스택을 구현하고, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *      - 1 X : 정수 X를 스택에 넣는다.
 *      - 2   : 스택에 정수가 있으면, 맨 위의 정수를 빼고 출력한다. 없다면 -1을 출력한다.
 *      - 3   : 스택의 정수 개수를 출력한다.
 *      - 4   : 스택이 비어있으면 1, 아니면 0을 출력한다.
 *      - 5   : 스택에 정수가 있으면 맨 위의 정수를 출력한다. 없다면 -1을 출력한다.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 스택 생성.
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        // 명령어 수행.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (command == 2) {
                if (!stack.empty()) {
                    sb.append(stack.pop());
                    sb.append("\n");
                } else {
                    sb.append(-1);
                    sb.append("\n");
                }
            } else if (command == 3) {
                sb.append(stack.size());
                sb.append("\n");
            } else if (command == 4) {
                sb.append(stack.empty() ? 1 : 0);
                sb.append("\n");
            } else {
                if (!stack.empty()) {
                    sb.append(stack.peek());
                    sb.append("\n");
                } else {
                    sb.append(-1);
                    sb.append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
