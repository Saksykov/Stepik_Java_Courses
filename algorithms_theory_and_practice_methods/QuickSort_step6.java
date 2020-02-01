/*
В первой строке задано два целых числа 1 ≤ n ≤ 50000 и  1 ≤ m ≤ 50000 — количество отрезков и точек на прямой,
соответственно. Следующие n строк содержат по два целых числа a_i и b_i ( a_i <= b_i) — координаты концов отрезков.
Последняя строка содержит m m целых чисел — координаты точек. Все координаты не превышают 10^8 по модулю.
Точка считается принадлежащей отрезку, если она находится внутри него или на границе.
Для каждой точки в порядке появления во вводе выведите, скольким отрезкам она принадлежит.
 */

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort_step6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arrayLeft = new int[n];
        int[] arrayRight = new int[n];
        for (int i = 0; i < n; i++) {
            arrayLeft[i] = scanner.nextInt();
            arrayRight[i] = scanner.nextInt();
        }
        Arrays.sort(arrayLeft);
        Arrays.sort(arrayRight);
        for (int i = 0; i < m; i++) {
            int j = scanner.nextInt();
            int count = findLeftIndex(arrayLeft, j) - findRightIndex(arrayRight, j);
            System.out.print(count + " ");
        }
    }

    private static int findLeftIndex(int[] array, int j) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == j) {
                while (true) {
                    if (m < array.length - 1){
                        if (array[m] == array[m + 1]) {
                            m++;
                        } else break;
                    } else break;
                }
                return m + 1;
            } else if (array[m] > j) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
    private static int findRightIndex(int[] array, int j) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == j) {
                while (true) {
                    if (m > 0){
                        if (array[m] == array[m - 1]) {
                            m--;
                        } else break;
                    } else break;
                }
                return m;
            } else if (array[m] > j) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
