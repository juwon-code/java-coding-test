/**
 * title : [1차] 비밀지도
 */

package juwoncode.programmers.level1;

import java.io.*;
import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int[] array1 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.print(Arrays.toString(solution(number, array1, array2)));

        bw.close();
        br.close();
    }

    public static String[] solution(int digit, int[] array1, int[] array2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < digit; i++) {
            String binaryString1 = getBinaryString(array1[i], digit);
            String binaryString2 = getBinaryString(array2[i], digit);

            for (int j = 0; j < digit; j++) {
                if (binaryString1.charAt(j) == '1' || binaryString2.charAt(j) == '1') {
                    result.append("#");
                } else {
                    result.append(" ");
                }
            }
            result.append(",");
        }

        return result.toString().split(",");
    }

    public static String getBinaryString(int number, int digit) {
        return String.format("%" + digit + "s", Integer.toBinaryString(number)).replace(" ", "0");
    }
}
