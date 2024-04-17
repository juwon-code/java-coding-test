/**
 * title : 할 일 목록
 */

package juwoncode.programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ToDoList {
    public static void main(String[] args) {
        String[] todos = new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finised = new boolean[]{true, false, true, false};
        System.out.println(Arrays.toString(solution(todos, finised)));
    }

    public static String[] solution(String[] todos, boolean[] finished) {
        return IntStream.range(0, finished.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todos[i]).toArray(String[]::new);
    }
}
