/*
Даны целые числа 1 ≤ n ≤ 10^18 и  2 ≤ m ≤ 10^5, необходимо найти остаток от деления n-го числа Фибоначчи на m.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci_step8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] str = string.split(" ");

        long n = Long.parseLong(str[0]);
        int m = Integer.parseInt(str[1]);
        int[] ints = new int[m * 6 + 1];

        for (int i = 0; i < ints.length; i++) {
            if (i < 2) ints[i] = i;
            else ints[i] = (ints[i - 1] + ints[i - 2]) % m;
        }

        int cikl = 0;
        for (int i = 2; i < ints.length-2; i++) {
            if (ints[i] == 0 && ints[i+1] == 1 && ints[i+2] == 1){
                cikl = i;
                break;
            }
        }
        if (cikl == 0) System.out.println(ints[(int)(n % m)]);
        else System.out.println(ints[(int)(n % cikl)]);
    }
}
