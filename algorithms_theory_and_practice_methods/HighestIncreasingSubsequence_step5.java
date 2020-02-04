/*
Дано целое число 1 ≤ n ≤ 10^3 и массив A[1…n] натуральных чисел, не превосходящих 2 * 10^9.
Выведите максимальное 1 ≤ k ≤ n, для которого найдётся подпоследовательность 1 ≤ i_1 <i_2 <…<i_k ≤ n длины k,
в которой каждый элемент делится на предыдущий (формально: для  всех 1 ≤ j < k, A[i_j] | A[i_j + 1]).
 */

import java.util.Scanner;

public class HighestIncreasingSubsequence_step5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] result = new int[n];
        int max = 0;
        for (int i = 0; i <array.length; i++) {
            result[i] = 1;
            for (int j = 0; j < i; j++) {
                if ((array[i] % array[j] == 0) && (result[j] + 1 > result[i])) {
                    result[i] = result[j] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }
        System.out.println(max);
    }
}
