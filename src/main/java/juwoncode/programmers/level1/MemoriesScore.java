/**
 * title : 추억 점수
 */

package juwoncode.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoriesScore {
    public static void main(String[] args) {
        String[] names = new String[]{"may", "kein", "kain", "radi"};
        int[] scores = new int[]{5, 10, 1, 3};
        String[][] photos = new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.print(Arrays.toString(solution(names, scores, photos)));
    }

    public static int[] solution(String[] names, int[] scores, String[][] photos) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], scores[i]);
        }

        int[] result = new int[photos.length];
        int index = 0;
        for (String[] photo : photos) {
            for (String name : photo) {
                result[index] += map.getOrDefault(name, 0);
            }
            index++;
        }

        return result;
    }
}
