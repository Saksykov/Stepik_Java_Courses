/*
Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации чисел следующий:

Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
Первый элемент последовательности устанавливается равным этому числу.
Следующие элементы вычисляются по рекуррентной формуле R_{n+1} = mid(R_{n}^2),
где mid — это функция, выделяющая второй, третий и четвертый разряд переданного числа.
Например, mid(123456) = 345.
 */

import java.util.stream.IntStream;

public class Stream_API_step11 {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, (x) -> {
            x *= x;
            return (x%10000 - x%10)/10;});
    }
}
