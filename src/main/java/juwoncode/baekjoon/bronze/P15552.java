/**
 * no          : 15552
 * title       : 빠른 A+B
 * description : 횟수 T 만큼 A와 B를 입력받고, A+B를 출력하시오. (제한시간은 1초)
 */

package juwoncode.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;

public class P15552 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int count = Integer.parseInt(reader.readLine());

            for (int i = 0; i < count; i++) {
                int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                writer.write((numbers[0] + numbers[1]) + "\n");
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
