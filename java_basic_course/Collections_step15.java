/*
Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность
в обратном порядке в System.out.
 */
import java.util.*;

public class Collections_step15 {  //rename class to Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputSet = new ArrayList<Integer>();
        int odd = 0;
        while (sc.hasNext()) {
            try {
                if (odd % 2 == 0) {
                    sc.next();
                } else {inputSet.add(Integer.parseInt(sc.next()));}
                odd++;
            } catch (NumberFormatException e) {
            }
        }
        Collections.reverse(inputSet);
        for (int i = 0; i < inputSet.size(); i ++) {
            System.out.print(inputSet.get(i));
            if (i == inputSet.size()-1 ) System.out.print("");
            else System.out.print(" ");
        }
    }
}
