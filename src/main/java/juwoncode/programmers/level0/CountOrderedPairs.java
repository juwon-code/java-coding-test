/**
 * title : 순서쌍의 개수
 */

package juwoncode.programmers.level0;

import java.io.*;
import java.util.stream.IntStream;

public class CountOrderedPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(n)));

        bw.close();
        br.close();
    }

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
