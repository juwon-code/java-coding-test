/**
 * title : n^2 배열 자르기
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitSquaredArrayOfN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(n, left, right)));

        bw.close();
        br.close();
    }

    public static int[] solution(int n, long left, long right) {
        int length = (int)(right - left) + 1;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int row = (int)(left / n + 1);
            int col = (int)(left % n + 1);
            result[i] = Math.max(row, col);
            left++;
        }

        return result;

        /*
        // 메모리 초과로 인해 폐기.
        int[][] array = new int[n][n];

        // 배열 만들기.
        int number = 1;
        for (int i = 0; i < n; i++) {
            array[i][i] = number;
            for (int j = i; j > 0; j--) {
                array[i][i - j] = number;
                array[i - j][i] = number;
            }
            number++;
        }

        // 1차원 배열로 만들기.
        int startRow = (int) left / n, startColumn = (int) left % n, count = (int)(right - left + 1), index = 0;
        int[] result = new int[count];
        for (int i = startRow; i < n; i++) {
            for (int j = startColumn; j < n; j++) {
                if (count == 0) {
                    break;
                }
                result[index++] = array[i][j];
                count--;
            }
            startColumn = 0;
        }

        // 결과 반환하기.
        return result;
        */
    }
}
