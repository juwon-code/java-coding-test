/**
 * title : 이어 붙인 수
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConcatenatedNumber {
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
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                sbEven.append(num);
            } else {
                sbOdd.append(num);
            }
        }

        return Integer.parseInt(sbOdd.toString()) + Integer.parseInt(sbEven.toString());
    }
}
