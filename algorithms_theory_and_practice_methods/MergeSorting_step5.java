/*
Первая строка содержит число 1 ≤ n ≤ 10^5, вторая — массив A[1…n], содержащий натуральные числа,
не превосходящие  10^9. Необходимо посчитать число пар индексов 1 ≤ i < j ≤ n , для которых A[i]>A[j].
(Такая пара элементов называется инверсией массива. Количество инверсий в массиве является в некотором смысле его
мерой неупорядоченности: например, в упорядоченном по неубыванию массиве инверсий нет вообще, а в массиве,
упорядоченном по убыванию, инверсию образуют каждые два элемента.)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MergeSorting_step5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = (reader.readLine()).split(" ");
        reader.close();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        mergeSort(array, 0, array.length - 1);

        System.out.println(count);

    }

    static long count = 0;

    static void mergeSort(int A[], int l, int r){
        if(l < r){
            int q = (r + l) / 2;
            mergeSort(A, l, q);
            mergeSort(A, q + 1, r);
            Merge(A, l, q, r);
        }
    }

    private static void Merge(int[] a, int l, int q, int r) {
        // вычисляем длину
        int lengthLeft = q - l + 1;
        int lengthRight = r - q;

        // создаем временные подмассивы
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = a[l+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = a[q+i+1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = l; i < r + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                    a[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    a[i] = rightArray[rightIndex];
                    rightIndex++;
                    count += lengthLeft - leftIndex;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                a[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                a[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
