/**
 * title : [1차] 캐시
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cache {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] cities = br.readLine().split(", ");
        bw.write(String.valueOf(solution(size, cities)));

        bw.close();
        br.close();
    }

    public static int solution(int size, String[] cities) {
        List<String> cache = new ArrayList<>();
        int time = 0;

        if (size == 0) {
            return 5 * cities.length;
        }

        for (String city : cities) {
            city = city.toUpperCase();

            if (cache.contains(city)) {
                cache.add(cache.remove(cache.indexOf(city)));
                time++;
            } else if (size > cache.size()){
                cache.add(city);
                time += 5;
            } else {
                cache.remove(0);
                cache.add(city);
                time += 5;
            }
        }

        return time;
    }
}
