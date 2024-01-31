/**
 * no          : 1269
 * title       : 대칭 차집합
 * description : 자연수를 원소로 갖는 집합 A, B에서 대칭 차집합{(A-B) + (B-A)}의 원소 개수를 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aCount = Integer.parseInt(st.nextToken());
        int bCount = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        Map<String, String> aMap = createMap(st);
        int aMapCount = aMap.size();

        st = new StringTokenizer(br.readLine());
        Map<String, String> bMap = createMap(st);
        int bMapCount = bMap.size();

        int commonCount = countCommonElement(aMap, bMap);

        bw.write(String.valueOf(aMapCount + bMapCount - commonCount));

        bw.close();
        br.close();
    }

    private static Map<String, String> createMap(StringTokenizer st) {
        Map<String, String> map = new HashMap<>();

        while (st.hasMoreTokens()) {
            String string = st.nextToken();
            map.put(string, null);
        }

        return map;
    }

    private static int countCommonElement(Map<String, String> map1, Map<String, String> map2) {
        int count = 0;

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                count += 2;
            }
        }

        return count;
    }
}
