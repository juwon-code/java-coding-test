/**
 * title : 가까운 1 찾기
 */

package juwoncode.programmers.level0;

public class FindNearOne {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 0, 0, 1};
        int idx1 = 1;

        int[] arr2 = new int[]{1, 0, 0, 1, 0, 0};
        int idx2 = 4;

        int[] arr3 = new int[]{1, 1, 1, 1, 0};
        int idx3 = 3;

        System.out.println(solution(arr1, idx1));
        System.out.println(solution(arr2, idx2));
        System.out.println(solution(arr3, idx3));
    }

    public static int solution(int[] array, int index) {
        int result = -1;

        for (int i = index; i < array.length; i++) {
            if (array[i] == 1) {
                result = i;
                break;
            }
        }

        return result;
    }
}
