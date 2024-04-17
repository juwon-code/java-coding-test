/**
 * title : 5명씩
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FivePeopleEach {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] names = new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        bw.write(Arrays.toString(solution(names)));
        bw.close();
    }

    public static String[] solution(String[] names) {
        return IntStream.range(0, names.length).filter(i -> i % 5 == 0).mapToObj(i -> names[i]).toArray(String[]::new);
    }
}
