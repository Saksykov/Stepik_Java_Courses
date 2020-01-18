/*
По данному числу 1 ≤ n ≤ 10^9 найдите максимальное число k, для которого n можно представить
как сумму k различных натуральных слагаемых. Выведите в первой строке число k, во второй — k слагаемых.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Greedy_algorithm_step11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (list.isEmpty() || i <= (n - count)) {
                list.add(i);
                count += i;
            }
            else {
                list.set(i - 2, list.get(i - 2) + (n - count));
                break;
            }
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
