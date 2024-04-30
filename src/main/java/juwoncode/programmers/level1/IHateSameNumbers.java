/**
 * title : 같은 숫자는 싫어
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IHateSameNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(array)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array) {
        List<Integer> result = new ArrayList<>();

        int _number = -1;
        for (int number : array) {
            if (number != _number) {
                result.add(number);
                _number = number;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
