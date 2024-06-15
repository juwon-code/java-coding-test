/**
 * title : 프로세스
 */

package juwoncode.programmers.level2;

import java.util.*;

public class Process {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] priorities = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int location = scanner.nextInt();

        System.out.print(solution(priorities, location));

        scanner.close();
    }

    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.add(priority);
        }

        int result = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    queue.poll();
                    result++;

                    if (i == location) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
