/*
Первая строка содержит количество предметов 1 ≤ n ≤ 10^3 и вместимость рюкзака 0 ≤ W ≤ 2⋅10^6.
Каждая из следующих n строк задаёт стоимость 0 ≤ C_i ≤ 2⋅10^6 и объём 0 < W_i ≤ 2⋅10^6 предмета
( n, W, c_i, w_i — целые числа).
Выведите максимальную стоимость частей предметов (от каждого предмета можно отделить любую часть,
стоимость и объём при этом пропорционально уменьшатся), помещающихся в данный рюкзак,
с точностью не менее трёх знаков после запятой.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_algorithm_step10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strings = reader.readLine();
        String[] str = strings.split(" ");
        int n = Integer.parseInt(str[0]);
        int w = Integer.parseInt(str[1]);

        double[][] array = new double[n][];

        for (int i = 0; i < n; i++) {
            String string = reader.readLine();
            String[] str1 = string.split(" ");
            double c = Double.parseDouble(str1[0]);
            double v = Double.parseDouble(str1[1]);
            array[i] = new double[(int)v];

            for (int j = 0; j < v; j++) {
                array[i][j] = c / v;
            }
        }
        sortByColumn(array, 0);

        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (count == w) { break; }
                sum += array[i][j];
                count++;
            }
        }

        System.out.printf("%.3f",sum);
    }

    public static void sortByColumn(double[][] array, int column) {
        Arrays.sort(array, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if (o2[column] > o1[column]) return 1;
                else return -1;
            }
        });
    }
}
