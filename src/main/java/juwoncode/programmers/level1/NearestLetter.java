/**
 * title : 가장 가까운 같은 글자
 */

package juwoncode.programmers.level1;

import java.util.*;

public class NearestLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        System.out.print(Arrays.toString(solution(string)));

        sc.close();
    }

    public static int[] solution(String string) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);

            if (map.containsKey(letter)) {
                int previous = map.get(letter);
                result.add(i - previous);
            } else {
                result.add(-1);
            }

            map.put(letter, i);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
