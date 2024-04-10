/**
 * title : 마지막 두 원소
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastTwoElements {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num_list1 = new int[]{2, 1, 6};
        bw.write(Arrays.toString(solution(num_list1)));
        bw.write("\n");

        int[] num_list2 = new int[]{5, 2, 1, 7, 5};
        bw.write(Arrays.toString(solution(num_list2)));

        bw.close();
    }

    public static int[] solution(int[] num_list) {
        List<Integer> num_array_list = new ArrayList<>();
        for (int num : num_list) {
            num_array_list.add(num);
        }

        int number1 = num_list[num_list.length - 1];
        int number2 = num_list[num_list.length - 2];

        num_array_list.add((number1 > number2) ? number1 - number2 : number1 * 2);
        return num_array_list.stream().mapToInt(Integer::intValue).toArray();
    }
}
