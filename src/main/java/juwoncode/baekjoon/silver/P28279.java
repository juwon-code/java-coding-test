/**
 * no          : 28279
 * title       : 덱 2
 * description : 정수를 저장하는 덱을 구현하고, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *      - 1 X : 정수 X를 덱의 앞에 넣는다.
 *      - 2 X : 정수 X를 덱의 앞에 넣는다.
 *      - 3   : 덱에 정수가 있으면, 가장 앞의 정수를 빼고 출력한다. 없다면 -1을 출력한다.
 *      - 4   : 덱에 정수가 있으면, 가장 뒤의 정수를 빼고 출력한다. 없다면 -1을 출력한다.
 *      - 5   : 덱에 들어있는 정수 개수를 출력한다.
 *      - 6   : 덱이 비어있으면 1, 아니면 0을 출력한다.
 *      - 7   : 덱에 정수가 있으면 가장 앞의 정수를 출력한다. 없다면 -1을 출력한다.
 *      - 8   : 덱에 정수가 있으면 가장 뒤의 정수를 출력한다. 없다면 -1을 출력한다.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        Deque<String> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    deque.addFirst(st.nextToken());
                    break;
                case 2:
                    deque.addLast(st.nextToken());
                    break;
                case 3:
                    sb.append(deque.isEmpty() ? "-1" : deque.pollFirst());
                    sb.append("\n");
                    break;
                case 4:
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast());
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(deque.size());
                    sb.append("\n");
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case 7:
                    sb.append(deque.isEmpty() ? "-1" : deque.peekFirst());
                    sb.append("\n");
                    break;
                case 8:
                    sb.append(deque.isEmpty() ? "-1" : deque.peekLast());
                    sb.append("\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
