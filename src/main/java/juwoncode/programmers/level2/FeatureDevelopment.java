/**
 * title : 기능개발
 */

package juwoncode.programmers.level2;

import java.io.*;
import java.util.*;

public class FeatureDevelopment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] progresses = convertStringToIntegerArray(br.readLine());
        int[] speeds = convertStringToIntegerArray(br.readLine());
        bw.write(Arrays.toString(solution(progresses, speeds)));

        bw.close();
        br.close();
    }

    private static int[] convertStringToIntegerArray(String string) {
        return Arrays.stream(string.split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        Queue<Integer> days = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            days.add((int) Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }

        int prev = days.poll(), count = 1;
        List<Integer> result = new ArrayList<>();
        while (!days.isEmpty()) {
            if (prev < days.peek()) {
                prev = days.poll();
                result.add(count);
                count = 1;
            } else {
                days.poll();
                count++;
            }
        }
        result.add(count);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
