/**
 * title : 실패율
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.*;

public class FailureRate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int stageCount = Integer.parseInt(br.readLine());
        int[] stageStops = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(stageCount, stageStops)));

        bw.close();
        br.close();
    }

    public static int[] solution(int stageCount, int[] stageStops) {
        int[] reaches = new int[stageCount];
        int[] notCompletes = new int[stageCount];
        for (int stageStop : stageStops) {
            if (stageStop > stageCount) {
                for (int i = 0; i < reaches.length; i++) {
                    reaches[i]++;
                }
                continue;
            }

            notCompletes[stageStop - 1]++;
            for (int i = 0; i < stageStop; i++) {
                reaches[i]++;
            }
        }

        Map<Integer, Double> failureRateMap = new HashMap<>();
        for (int i = 0; i < stageCount; i++) {
            failureRateMap.put(i + 1, (double) reaches[i] / notCompletes[i]);
        }

        List<Integer> result = new ArrayList<>(failureRateMap.keySet());
        result.sort(Comparator.comparingDouble(failureRateMap::get));

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
