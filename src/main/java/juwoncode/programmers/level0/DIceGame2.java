/**
 * title : 주사위 게임 2
 */

package juwoncode.programmers.level0;

import java.io.*;

public class DIceGame2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(a, b, c)));

        bw.close();
        br.close();
    }

    public static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return (int) (addSquares(a, b, c, 1) * addSquares(a, b, c, 2) * addSquares(a, b, c, 3));
        }

        if (a == b || b == c || a == c) {
            return (int) (addSquares(a, b, c, 1) * addSquares(a, b, c, 2));
        }

        return (int) addSquares(a, b, c, 1);
    }

    private static double addSquares(int a, int b, int c, int pow) {
        return Math.pow(a, pow) + Math.pow(b, pow) + Math.pow(c, pow);
    }
}
