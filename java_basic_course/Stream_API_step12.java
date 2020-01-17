/*
Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);
 */

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Stream_API_step12 {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        Object[] objects = stream.sorted(order).toArray();
        T[] tobjects = (T[]) objects;
        if (objects.length == 0) {
            minMaxConsumer.accept(null, null);
        }
        else minMaxConsumer.accept((T)tobjects[0],(T) tobjects[tobjects.length - 1]);
    }
}
