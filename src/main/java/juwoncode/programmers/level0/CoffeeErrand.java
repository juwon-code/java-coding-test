/**
 * title : 커피 심부름
 */

package juwoncode.programmers.level0;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class CoffeeErrand {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] orders = new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"};

        bw.write(String.valueOf(solution(orders)));
        bw.close();
    }

    public static int solution(String[] orders) {
        return Arrays.stream(orders)
                .mapToInt(order -> order.contains("americano") || order.contains("anything") ? 4500 : 5000).sum();
    }
}
