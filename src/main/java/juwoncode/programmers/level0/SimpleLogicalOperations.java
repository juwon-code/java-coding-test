/**
 * title : 간단한 논리 연산
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SimpleLogicalOperations {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(solution(false, true, true, true)));
        bw.write("\n");
        bw.write(String.valueOf(solution(true, false, false, false)));

        bw.close();
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
