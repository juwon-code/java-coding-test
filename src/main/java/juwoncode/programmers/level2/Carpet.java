/**
 * title : 카펫
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int brown = Integer.parseInt(br.readLine());
        int yellow = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(brown, yellow)));

        bw.close();
        br.close();
    }

    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] result = new int[2];

        for (int i = 3; i <= Math.sqrt(total); i++) {
            if (total % i != 0) {
                continue;
            }

            int width = Math.max(i, total / i);
            int height = Math.min(i, total / i);
            int _brown = 2 * width + 2 * height - 4;

            if (_brown == brown) {
                result[0] = width;
                result[1] = height;
                break;
            }
        }

        return result;
    }
}
