/**
 * no          : 10816
 * title       : 숫자 카드 2
 * description : 상근이는 N개의 숫자 카드 패를 갖고 있다. M개의 숫자 카드에 대해서 상근이가 몇 개 갖고 있는지 출력하시오.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            if (map.containsKey(card)) {
                map.replace(card, map.get(card) + 1);
            } else {
                map.put(card, 1);
            }
        }

        count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(card, 0) + " ");
        }

        bw.close();
        br.close();
    }
}
