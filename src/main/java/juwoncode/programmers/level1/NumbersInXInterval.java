/**
 * title : x만큼 간격이 있는 n개의 숫자
 */

package juwoncode.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumbersInXInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Arrays.toString(solution(scanner.nextInt(), scanner.nextInt())));

        scanner.close();
    }

    public static long[] solution(int x, int count) {
        List<Long> list = new ArrayList<>();
        long _x = x;

        for (int i = 0; i < count; i++) {
            list.add((long) _x);
            _x += x;
        }

        return list.stream().mapToLong(Long::longValue).toArray();
    }
}
