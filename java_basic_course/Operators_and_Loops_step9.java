/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный
в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 */

import java.util.Arrays;

public class Operators_and_Loops_step9 {

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        for(int i = 0; i < a1.length; i++){
            arr[i] = a1[i];
        }
        for(int i = 0; i < a2.length; i++){
            arr[a1.length + i] = a2[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
