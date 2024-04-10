/**
 * title : 원소들의 곱과 합
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MultiplicationAndSumOfElements {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num_list1 = new int[]{3, 4, 5, 2, 1};
        bw.write(String.valueOf(solution(num_list1)));
        bw.write("\n");

        int[] num_list2 = new int[]{5, 7, 8, 3};
        bw.write(String.valueOf(solution(num_list2)));
        bw.close();
    }

    public static int solution(int[] num_list) {
        int resultSum = 0;
        int resultMul = 1;

        for (int num : num_list) {
            resultSum += num;
            resultMul *= num;
        }
        resultSum = (int) Math.pow(resultSum, 2);

        return resultMul < resultSum ? 1 : 0;
    }
}
