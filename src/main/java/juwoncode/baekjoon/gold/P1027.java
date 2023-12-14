/**
 * no          : 1027
 * title       : 고층 건물
 * description : N개의 빌딩의 높이가 주어질 때, 가장 많은 빌딩이 보이는 수를 출력하시오.
 */

package juwoncode.baekjoon.gold;

import java.util.Scanner;

public class P1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        // 빌딩이 세 개 이하인 경우
        if (count < 3) {
            System.out.print(--count);
            System.exit(0);
        }

        // 빌딩 높이 입력
        double[] buildings = new double[count];
        for (int i = 0; i < count; i++) {
            buildings[i] = scanner.nextInt();
        }

        // 기울기 테이블 생성
        double[][] slopes = new double[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i != j) {
                    slopes[i][j] = (buildings[j] - buildings[i]) / (j - i);
                }
            }
        }

        // 테이블 탐색
        int max = 0;
        for (int i = 0; i < count; i++) {
            int _count = 0;
            // 오른쪽 탐색
            double rPointer = 0;
            for (int j = i+1; j < count; j++) {
                if (j == i+1) {
                    rPointer = slopes[i][j];
                    _count++;
                    continue;
                }
                if (rPointer < slopes[i][j]) {
                    rPointer = slopes[i][j];
                    _count++;
                }
            }
            // 왼쪽 탐색
            double lPointer = 0;
            for (int j = i-1; j >= 0; j--) {
                if (j == i-1) {
                    lPointer = slopes[i][j];
                    _count++;
                    continue;
                }
                if (lPointer > slopes[i][j]) {
                    lPointer = slopes[i][j];
                    _count++;
                }
            }
            max = Math.max(_count, max);
        }

        // 출력하기
        System.out.print(max);
        scanner.close();
    }
}
