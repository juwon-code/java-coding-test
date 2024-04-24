/**
 * title : 옷가게 할인 받기
 */

package juwoncode.programmers.level0;

import java.io.*;

public class DiscountClothingStore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int price = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(price)));

        bw.close();
        br.close();
    }

    public static int solution(int price) {
        if (price >= 500000) {
            return (int) (price * 0.8);
        }
        if (price >= 300000) {
            return (int) (price * 0.9);
        }
        if (price >= 100000) {
            return (int) (price * 0.95);
        }
        return price;
    }
}
