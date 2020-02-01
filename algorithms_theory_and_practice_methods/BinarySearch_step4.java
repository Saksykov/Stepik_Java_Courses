/*
В первой строке даны целое число 1 ≤ n ≤ 10^5 и массив A[1…n] из n различных натуральных чисел, не превышающих 10^9,
в порядке возрастания, во второй — целое число 1 ≤ k ≤ 10^5 k натуральных чисел b_1, ......., b_k ,
не превышающих 10^9. Для каждого i от 1 до k необходимо вывести индекс  1 ≤ j ≤ n, для которого A[j]=b_i,
или -1, если такого j нет.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch_step4 { //change className to Main
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = (reader.readLine()).split(" ");

        int[] a = new int[Integer.parseInt(str1[0])];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str1[i + 1]);
        }

        String[] str2 = (reader.readLine()).split(" ");
        reader.close();

        int[] b = new int[Integer.parseInt(str2[0])];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(str2[i + 1]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(findIndex(a, b[i]) + " ");
        }
    }

    static int findIndex(int[] a, int b) {
        int i = 1;
        int n = a.length;
        while (i <= n) {
            int m = i + (n - i) / 2;
            if (a[m-1] == b){
                return m;
            } else if (a[m-1] > b) {
                n = m-1;
            } else i = m + 1;
        }
        return -1;
    }
}
