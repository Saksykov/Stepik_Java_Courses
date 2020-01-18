/*
Первая строка входа содержит число операций  1 ≤ n ≤ 10^5.
Каждая из последующих n строк задают операцию одного из следующих двух типов:

Insert x, где  0 ≤ x ≤ 10^9 — целое число;
ExtractMax.
Первая операция добавляет число x в очередь с приоритетами, вторая — извлекает максимальное число и выводит его.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Greedy_algorithm_Priority_Queue_step8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            if (s.contains("Insert")) {
                String[] strings = s.split(" ");
                int x = Integer.parseInt(strings[1]);
                queue.add(x);
            } else {
                System.out.println(queue.poll());
            }
        }
    }

    static Comparator<Integer> comparator = (o1, o2) -> {
        if (o2>=o1) return 1;
        return -1;
    };
}
