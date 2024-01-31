/**
 * no          : 1764
 * title       : 듣보잡
 * description : N명의 듣지 못한 사람, M명의 보지 못한 사람이 주어질 때, 듣드 보지 못한 총 명수와 사람명을 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.*;

public class P1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hearCount = Integer.parseInt(st.nextToken());
        int seenCount = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < hearCount; i++) {
            map.put(br.readLine(), 1);
        }

        List<String> names = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < seenCount; i++) {
            String name = br.readLine();
            if (map.containsKey(name)) {
                names.add(name);
                count++;
            }
        }

        names.sort(Comparator.naturalOrder());

        bw.write(count + "\n");
        for (String name : names) {
            bw.write(name + "\n");
        }

        bw.close();
        br.close();
    }
}
