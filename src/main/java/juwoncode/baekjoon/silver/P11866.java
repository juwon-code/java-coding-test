/**
 * no          : 11866
 * title       : 요세푸스 문제 0
 * description : 1 ~ N번 까지 원을 이루어 있을 때, 순서대로 K번째 번호를 제거한다. 제거되는 숫자들을 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class P11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= count; i++) {
            queue.addLast(i);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            for (int j = 1; j < number; j++) {
                queue.addLast(queue.pollFirst());
            }
            list.add(queue.pollFirst());
        }

        String result = list.stream()
                .map(Object::toString).collect(Collectors.joining(", ", "<", ">"));
        bw.write(result);
        bw.close();
        br.close();
    }
}
