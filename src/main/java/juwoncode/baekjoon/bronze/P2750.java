/**
 * no          : 2750
 * title       : 수 정렬하기
 * description : N개의 수를 입력받아, 오름차순으로 정렬하고 출력하시오.
 */

package juwoncode.baekjoon.bronze;

import java.io.*;

public class P2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        insertionSort(array);

        for (int number : array) {
            bw.write(number + "\n");
        }

        bw.close();
        br.close();
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = Integer.MAX_VALUE, pointer = -1;
            for (int j = i; j < array.length; j++) {
                if (temp > array[j]) {
                    temp = array[j];
                    pointer = j;
                }
            }
            array[pointer] = array[i];
            array[i] = temp;
        }

        return array;
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }
}
