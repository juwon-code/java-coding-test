/**
 * title : 기사단원의 무기
 */

package juwoncode.programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemplarWeapon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(solution(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        sc.close();
    }

    public static int solution(int number, int limit, int altPower) {
        List<Integer> powers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            int count = 0, sqrt = (int) Math.sqrt(i);
            for (int j = 1; j <= sqrt; j++) {
                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }
            powers.add(count);
        }

        int kg = 0;
        for (int power : powers) {
            kg += power <= limit ? power : altPower;
        }

        return kg;
    }
}
