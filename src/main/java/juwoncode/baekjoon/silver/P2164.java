/**
 * no          : 2164
 * title       : 카드2
 * description : N장의 카드가 있을 때 한 장이 남을 때까지, 맨 앞의 카드를 버리고, 다음 카드는 맨 아래로 옮긴다. 최종적으로 남은 카드를 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        Deque<String> queue = new LinkedList<>();
        for (int i = 1; i <= number; i++) {
            queue.addLast(String.valueOf(i));
        }

        while (queue.size() != 1) {
            queue.pollFirst();
            queue.addLast(queue.pollFirst());
        }

        bw.write(queue.peek() + "");
        bw.close();
        br.close();
    }
}
