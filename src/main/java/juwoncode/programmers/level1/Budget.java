/**
 * title : 예산
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class Budget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] requirements = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int budget = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(requirements, budget)));

        bw.close();
        br.close();
    }

    public static int solution(int[] requirements, int budget) {
        int count = 0;

        Arrays.sort(requirements);
        for (int requirement : requirements) {
            budget -= requirement;
            count++;

            if (budget <= 0) {
                if (budget < 0) {
                    count--;
                }
                break;
            }
        }

        return count;
    }
}
