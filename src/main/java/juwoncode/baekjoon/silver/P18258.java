/**
 * no          : 18258
 * title       : 큐 2
 * description : 정수를 저장하는 큐를 구현하고, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *      - push X : 정수 X를 큐에 넣는다.
 *      - pop    : 큐에 정수가 있으면, 가장 앞의 정수를 빼고 출력한다. 없다면 -1을 출력한다.
 *      - size   : 큐의 정수 개수를 출력한다.
 *      - empty  : 큐가 비어있으면 1, 아니면 0을 출력한다.
 *      - front  : 큐에 정수가 있으면 가장 앞의 정수를 출력한다. 없다면 -1을 출력한다.
 *      - back   : 큐에 정수가 있으면 가장 앞의 정수를 출력한다. 없다면 -1을 출력한다.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque<String> queue = new LinkedList<>();

        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                queue.addLast(st.nextToken());
            } else if (command.equals("pop")) {
                sb.append(!queue.isEmpty() ? queue.pollFirst() : "-1");
                sb.append("\n");
            } else if (command.equals("size")) {
                sb.append(queue.size());
                sb.append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("front")) {
                sb.append(!queue.isEmpty() ? queue.peekFirst() : "-1");
                sb.append("\n");
            } else if (command.equals("back")) {
                sb.append(!queue.isEmpty() ? queue.peekLast() : "-1");
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
