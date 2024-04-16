/**
 * title : 리스트 자르기
 */

package juwoncode.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SliceList {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int[] slicer = new int[]{1, 5, 2};
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(solution(n1, slicer, array)));
        System.out.println(Arrays.toString(solution(n2, slicer, array)));
    }

    public static int[] solution(int n, int[] slicer, int[] array) {
        List<Integer> list = new ArrayList<>();

        switch (n) {
            case 1 -> {
                for (int i = 0; i <= slicer[1]; i++) {
                    list.add(array[i]);
                }
            }
            case 2 -> {
                for (int i = slicer[0]; i < array.length; i++) {
                    list.add(array[i]);
                }
            }
            case 3 -> {
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    list.add(array[i]);
                }
            }
            case 4 -> {
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    list.add(array[i]);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
