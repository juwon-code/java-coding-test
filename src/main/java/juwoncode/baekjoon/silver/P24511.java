/**
 * no          : 24511
 * title       : queuestack
 * description : 문제 참조.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.*;

public class P24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count1 = Integer.parseInt(br.readLine());
        int[] dists = new int[count1];
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count1; i++) {
            dists[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count1; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (dists[i] == 0) {
                deque.addLast(number);
            }
        }

        int count2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count2; i++) {
            deque.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(deque.pollLast());
            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
