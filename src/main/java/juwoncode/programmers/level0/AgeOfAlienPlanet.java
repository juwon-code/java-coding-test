/**
 * title : 외계행성의 나이
 */

package juwoncode.programmers.level0;

import java.io.*;

public class AgeOfAlienPlanet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int age = Integer.parseInt(br.readLine());
        bw.write(solution(age));

        bw.close();
        br.close();
    }

    public static String solution(int age) {
        char[] array = String.valueOf(age).toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i] += 49;
        }

        return new String(array);
    }
}
