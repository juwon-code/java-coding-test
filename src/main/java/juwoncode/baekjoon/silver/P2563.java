/**
 * no          : 2563
 * title       : 색종이
 * description : 가로 세로가 100인 정사각형 도화지에, 가로 세로가 10인 정사각형의 색종이를 붙인다.
 *      N개의 색종이의 시작 좌표를 입력받고, 색종이 영역의 넓이를 구하라.
 */

package juwoncode.baekjoon.silver;

import java.util.Scanner;

public class P2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int maxX = 0, maxY = 0;
        int[][] confetti = new int[count][2];

        // 색종이 좌표를 입력받고, 최대 좌표를 구한다.
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            confetti[i][0] = x;
            confetti[i][1] = y;
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        // 색종이 영역의 값을 1로 설정한다.
        maxX += 10; maxY += 10;
        int[][] paper = new int[maxY][maxX];
        for (int i = 0; i < count; i++) {
            int xStart = confetti[i][0];
            int yStart = confetti[i][1];
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    paper[yStart + j][xStart + k] = 1;
                }
            }
        }

        // 1의 개수를 구한다.
        int result = 0;
        for (int[] paperY : paper) {
            for (int paperX : paperY) {
                if (paperX == 1) {
                    result++;
                }
            }
        }

        System.out.print(result);
        scanner.close();
    }
}
