/**
 * title : 배열 회전시키기
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

public class RotateArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String direction = br.readLine();
        bw.write(Arrays.toString(solution(array, direction)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, String direction) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.stream(array).boxed().collect(Collectors.toList()));

        if (direction.equals("left")) {
            deque.addLast(deque.pollFirst());
        } else {
            deque.addFirst(deque.pollLast());
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
