/**
 * title : 자연수 뒤집어 배열로 만들기
 */

package juwoncode.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Arrays.toString(solution(scanner.nextLong())));

        scanner.close();
    }

    public static int[] solution(long number) {
        List<Integer> list = Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
