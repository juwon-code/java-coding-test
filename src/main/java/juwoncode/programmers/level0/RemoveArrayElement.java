/**
 * title : 배열의 원소 삭제하기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveArrayElement {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[]{293, 1000, 395, 678, 94};
        int[] deleteArray = new int[]{94, 777, 104, 1000, 1, 12};
        bw.write(Arrays.toString(solution(array, deleteArray)));

        bw.close();
    }

    public static int[] solution(int[] array, int[] deleteArray) {
        List<Integer> result = new ArrayList<>();

        for (int number1 : array) {
            boolean flag = true;
            for (int number2 : deleteArray) {
                if (number1 == number2) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(number1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
