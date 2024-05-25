/**
 * title : 의상
 */

package juwoncode.programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Outfit {
    public static void main(String[] args) {
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.print(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] details : clothes) {
            map.put(details[1], map.getOrDefault(details[1], 0) + 1);
        }

        if (map.size() == 1) {
            return map.get(clothes[0][1]);
        }

        int result = 1;
        for (int value : map.values()) {
            result *= (value + 1);
        }

        return result - 1;
    }
}
