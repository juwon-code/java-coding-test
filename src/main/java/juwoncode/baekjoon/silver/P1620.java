/**
 * no          : 1620
 * title       : 나는야 포켓몬 마스터 이다솜
 * description : 페이지 참조.
 */

package juwoncode.baekjoon.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        Map<Integer, String> numberDict = new HashMap<>();
        Map<String, Integer> stringDict = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = reader.readLine();
            numberDict.put(i, name);
            stringDict.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String keyword = reader.readLine();
            boolean isDigit = keyword.chars().allMatch(Character::isDigit);
            writer.write((isDigit ? numberDict.get(Integer.parseInt(keyword)) : stringDict.get(keyword)) + "\n");
        }

        writer.close();
        reader.close();
    }
}
