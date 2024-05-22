/**
 * title : 귤 고르기
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.*;

public class SelectTangerine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int[] tangerines = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(solution(k, tangerines)));

        bw.close();
        br.close();
    }

    public static int solution(int count, int[] tangerines) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int tangerine : tangerines) {
            map.put(tangerine, map.getOrDefault(tangerine, 0) + 1);
        }

        // 키셋 리스트를 만들고 내림차순으로 정렬.
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int result = 0;
        for (int key : keySet) {
            count -= map.get(key);
            result++;
            if (count <= 0) {
                break;
            }
        }

        return result;
    }
}
