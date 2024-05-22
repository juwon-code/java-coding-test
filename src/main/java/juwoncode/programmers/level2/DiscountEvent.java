/**
 * title : 할인 행사
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] wants = new String[]{"banana", "apple", "rice", "pork", "pot"};
        int[] counts = new int[]{3, 2, 2, 2, 1};
        String[] discounts = new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        bw.write(String.valueOf(solution(wants, counts, discounts)));

        bw.close();
        br.close();
    }

    public static int solution(String[] wants, int[] counts, String[] discounts) {
        Map<String, Integer> wantsMap = new HashMap<>();
        for (int i = 0; i < wants.length; i++) {
            wantsMap.put(wants[i], counts[i]);
        }

        int answer = 0;
        for (int i = 0; i < discounts.length - 9; i++) {
            Map<String, Integer> discountsMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                discountsMap.put(discounts[j], discountsMap.getOrDefault(discounts[j], 0) + 1);
            }
            boolean isPerfect = true;
            for (String key : wantsMap.keySet()) {
                if (wantsMap.get(key) > discountsMap.getOrDefault(key, 0)) {
                    isPerfect = false;
                    break;
                }
            }
            if (isPerfect) {
                answer++;
            }
        }

        return answer;
    }
}