/**
 * title : 정수 내림차순으로 배치하기
 */

package juwoncode.programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

public class SortIntegerByReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLong()));

        scanner.close();
    }

    public static long solution(long number) {
        List<Long> list = Arrays.stream(String.valueOf(number).split(""))
                .mapToLong(Long::parseLong).boxed().collect(Collectors.toList());

        list.sort(Comparator.reverseOrder());

        return Long.parseLong(list.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
