/*
Вычислите расстояние редактирования двух данных непустых строк длины не более 10^2,
содержащих строчные буквы латинского алфавита.
 */

import java.util.Arrays;
import java.util.Scanner;

public class EditDistance_step8 {
    static String str1;
    static String str2;
    static int[][] d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.next();
        str2 = scanner.next();
        d = new int[str1.length() + 1][str2.length() + 1];
        for (int[] ints : d) {
            Arrays.fill(ints, -1);
        }
        System.out.println(findEditingCount(str1.length(), str2.length()));
    }

    private static int findEditingCount(int n, int m) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        if (d[n][m] != -1) {
            return d[n][m];
        }
        int a = findEditingCount(n - 1, m) + 1;
        int b = findEditingCount(n, m - 1) + 1;
        int c = findEditingCount(n - 1, m - 1) + (str1.charAt(n - 1) == str2.charAt(m - 1) ? 0 : 1);
        int result = Math.min(Math.min(a, b), c);
        d[n][m] = result;
        return result;
    }
}
