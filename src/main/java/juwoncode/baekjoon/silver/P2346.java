/**
 * no          : 2346
 * title       : 풍선 터뜨리기
 * description : 문제 참조.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P2346 {
    private static class Balloon {
        private int index;
        private int number;

        public Balloon(int index, int number) {
            this.index = index;
            this.number = number;
        }

        public int getIndex() {
            return index;
        }

        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 1; i <= count; i++) {
            int number = Integer.parseInt(st.nextToken());
            deque.add(new Balloon(i, number));
        }

        StringBuilder sb = new StringBuilder("1");
        int number = deque.pollFirst().getNumber();

        for (int i = 1; i < count; i++) {
            Balloon balloon;
            if (number > 0) {
                for (int j = 1; j < number; j++) {
                    deque.addLast(deque.pollFirst());
                }
                balloon = deque.pollFirst();
            } else {
                for (int j = 1; j < Math.abs(number); j++) {
                    deque.addFirst(deque.pollLast());
                }
                balloon = deque.pollLast();
            }
            number = balloon.getNumber();
            sb.append(" " + balloon.getIndex());
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
