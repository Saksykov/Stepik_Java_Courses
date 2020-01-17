/*
Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_step14 {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> setSym = new HashSet<T>();
        Set<T> setTemp = new HashSet<T>();
        setTemp.addAll(set1);
        setTemp.addAll(set2);
        Iterator<T> iteratorForSetTemp = setTemp.iterator();
        while (iteratorForSetTemp.hasNext()) {
            T nextT = iteratorForSetTemp.next();
            if (!set1.contains(nextT) && !set2.contains(nextT)) setSym.add(nextT);
        }
        return setSym;
    }
}
