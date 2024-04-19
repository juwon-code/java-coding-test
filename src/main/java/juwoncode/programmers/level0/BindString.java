/**
 * title : 문자열 묶기
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BindString {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = new String[]{"a", "bc", "d", "efg", "hi"};
        bw.write(String.valueOf(solution(array)));

        bw.close();
    }

    public static int solution(String[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (String string : array) {
            int length = string.length();
            if (map.containsKey(length)) {
                map.put(length, map.get(length) + 1);
            } else {
                map.put(length, 1);
            }
        }

        return Collections.max(map.values());
    }
}
