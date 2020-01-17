/*
Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов,
и в конце выводящую 10 наиболее часто встречающихся слов.

Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр.
Например, в строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API_step13 {
    public static void main(String[] args) {
        Charset charset = StandardCharsets.UTF_8;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, charset));
        bufferedReader.lines().flatMap(x -> Stream.of(x.split("[\\p{Blank}\\p{Punct}]+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(
                        (e0, e1) -> {
                            final int res = e1.getValue().compareTo(e0.getValue());
                            return res == 0 ? e0.getKey().compareTo(e1.getKey()) : res;
                        }
                )
                .limit(10)
                .forEach(x -> System.out.println(x.getKey()));
    }
}
