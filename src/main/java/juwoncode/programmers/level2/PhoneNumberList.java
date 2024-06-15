/**
 * title : 전화번호 목록
 */

package juwoncode.programmers.level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(solution(scanner.nextLine().split(", ")));

        scanner.close();
    }

    public static boolean solution(String[] phones) {
        Map<String, Integer> map = new HashMap<>();

        for (String phone : phones) {
            map.put(phone, 0);
        }

        for (String phone : phones) {
            for (int j = 0; j < phone.length(); j++) {
                if (map.containsKey(phone.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}
