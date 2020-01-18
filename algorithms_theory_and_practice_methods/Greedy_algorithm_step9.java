/*
По данным n отрезкам необходимо найти множество точек минимального размера, для которого каждый из
отрезков содержит хотя бы одну из точек.

В первой строке дано число 1 ≤ n ≤ 100 отрезков. Каждая из последующих n n строк содержит по два числа 0 ≤ l ≤ r ≤ 10^9,
задающих начало и конец отрезка. Выведите оптимальное число m точек и сами m точек.
Если таких множеств точек несколько, выведите любое из них.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Greedy_algorithm_step9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] otr = new int[n][];
        sc.nextLine();
        List<Spot> listSpots = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] split = sc.nextLine().split(" ");
            otr[i] = new int[2];
            otr[i][0] = Integer.parseInt(split[0]);
            otr[i][1] = Integer.parseInt(split[1]);
        }

        for (int i = 0; i < n; i+=1) {
            listSpots.add(new Spot(i + 1, otr[i][0], 'L'));
            listSpots.add(new Spot(i + 1, otr[i][1], 'R'));
        }

        listSpots.sort(Comparator.naturalOrder());

        for (int i = 0; i < listSpots.size(); i++) {
            if(listSpots.get(i).side == 'L')
                stack.add(listSpots.get(i).numOtrezok);
            else if(stack.contains(listSpots.get(i).numOtrezok)){
                result.add(listSpots.get(i).spotval);
                stack.clear();
            }
        }
        System.out.println(result.size());
        result.forEach(integer -> System.out.print(integer + " "));
    }
}

class Spot implements Comparable{
    int numOtrezok, spotval;
    char side;
    public Spot(int numOtrezok, int spotval, char side) {
        this.numOtrezok = numOtrezok;
        this.spotval = spotval;
        this.side = side;
    }
    @Override
    public int compareTo(Object o) {
        Spot spot = (Spot)o;
        int numres = Integer.compare(this.spotval, spot.spotval);
        switch (numres){
            case 0: return side == 'R' ? 1 : -1;
            default: return numres;
        }
    }
}