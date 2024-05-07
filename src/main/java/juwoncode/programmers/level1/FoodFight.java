/**
 * title : 푸드 파이트 대회
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class FoodFight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] foods = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(solution(foods));

        bw.close();
        br.close();
    }

    public static String solution(int[] foods) {
        StringBuilder result = new StringBuilder("0");
        int lastIndex = foods.length - 1, foodNumber = lastIndex;

        for (int i = lastIndex; i >= 0; i--) {
            String foodString = String.valueOf(foodNumber).repeat(foods[i] / 2);
            result.append(foodString);
            result.insert(0, foodString);
            foodNumber--;
        }

        return result.toString();
    }
}
