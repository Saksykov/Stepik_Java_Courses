/*
Первая строка содержит число  1 ≤ n ≤ 10^4, вторая —  n натуральных чисел, не превышающих 10.
Выведите упорядоченную по неубыванию последовательность этих чисел.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingOnComparisons_step3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] array = new int[n];
        int[] arrayCount = new int[11];
        String[] str = (reader.readLine()).split(" ");
        for (int i = 0; i < n; i++) {
            arrayCount[Integer.parseInt(str[i])]++;
        }
        reader.close();
        int j = 0;
        for (int i = 0; i < arrayCount.length; i++) {
            int count = 0;
            while (count < arrayCount[i]) {
                array[j++] = i;
                count++;
                System.out.print(i + " ");
            }
        }
    }
}
