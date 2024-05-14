/**
 * title : 최소직사각형
 */

package juwoncode.programmers.level1;

public class SmallestRectangle {
    public static void main(String[] args) {
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
        }

        int maxW = 0, maxH = 0;
        for (int[] size : sizes) {
            if (size[0] > maxW) {
                maxW = size[0];
            }
            if (size[1] > maxH) {
                maxH = size[1];
            }
        }

        return maxW * maxH;
    }
}
