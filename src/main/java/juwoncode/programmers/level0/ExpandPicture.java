/**
 * title : 그림 확대
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpandPicture {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] pictures = new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;

        bw.write(Arrays.toString(solution(pictures, k)));
        bw.close();
    }

    public static String[] solution(String[] pictures, int k) {
        List<String> result = new ArrayList<>();

        for (String picture : pictures) {
            String[] fragments = picture.split("");
            StringBuilder sb = new StringBuilder();

            for (String fragment : fragments) {
                sb.append(fragment.repeat(k));
            }

            for (int i = 0; i < k; i++) {
                result.add(sb.toString());
            }
        }

        return result.toArray(String[]::new);
    }
}
