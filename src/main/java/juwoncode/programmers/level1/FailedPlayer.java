/**
 * title : 완주하지 못한 선수
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FailedPlayer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine().split(","), br.readLine().split(",")));

        bw.close();
        br.close();
    }

    public static String solution(String[] players, String[] finishers) {
        Map<String, Integer> map = new HashMap<>();
        for (String player : players) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String finisher : finishers) {
            map.put(finisher, map.get(finisher) - 1);
        }

        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }
}
