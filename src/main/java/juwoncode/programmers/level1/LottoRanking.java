/**
 * title : 로또 최고 순위와 최저 순위
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class LottoRanking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] lottos = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] wins = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(lottos, wins)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] lottos, int[] wins) {
        int winCount = 0, zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }

            for (int i = 0; i < 6; i++) {
                if (lotto == wins[i]) {
                    wins[i] = -1;
                    winCount++;
                }
            }
        }

        int bestRank = (winCount + zeroCount < 2) ? 6 : 7 - (winCount + zeroCount);
        int worstRank = (winCount < 2) ? 6 : 7 - winCount;

        return new int[]{bestRank, worstRank};
    }
}
