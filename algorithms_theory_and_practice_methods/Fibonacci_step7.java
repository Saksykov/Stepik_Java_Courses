/*
Дано число 1 ≤ n ≤ 10^7, необходимо найти последнюю цифру n-го числа Фибоначчи.

Как мы помним, числа Фибоначчи растут очень быстро, поэтому при их вычислении нужно быть аккуратным с переполнением.
В данной задаче, впрочем, этой проблемы можно избежать, поскольку нас интересует только последняя цифра числа Фибоначчи:
если 0 ≤ a,b ≤ 9 — последние цифры чисел F_i и F_{i+1} соответственно, то (a+b)mod10 — последняя цифра числа F_{i+2}.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci_step7 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] ints = new int[n+1];

        for (int i = 0; i <= n; i++) {
            if (i < 2) ints[i] = i;
            else ints[i] = ints[i - 1]%10 + ints[i - 2]%10;
        }

        System.out.println(ints[n]%10);
    }
}
