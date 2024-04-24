package juwoncode.programmers.level0;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SliceArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int start = Integer.parseInt(br.readLine()), end = Integer.parseInt(br.readLine());
        bw.write(Arrays.toString(solution(array, start, end)));

        bw.close();
        br.close();
    }

    public static int[] solution(int[] array, int start, int end) {
        return IntStream.rangeClosed(start, end).map(i -> array[i]).toArray();
    }
}
