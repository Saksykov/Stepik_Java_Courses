/*
Дано целое число 1 ≤ n ≤ 40, необходимо вычислить n-е число Фибоначчи
(напомним, что F_0 = 0, F_1 = 1 и F_n = F_{n-1} + F_{n-2} при n ≥ 2).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci_step6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] ints = new int[n+1];

        for (int i = 0; i <= n; i++) {
            if (i < 2) ints[i] = i;
            else ints[i] = ints[i - 1] + ints[i - 2];
        }

        System.out.println(ints[n]);
    }
}
