/*
Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных
в тексте вещественных чисел с точностью до шестого знака после запятой. Числом считается последовательность символов,
отделенная от окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
 */

import java.util.Scanner;

public class Streams_Chars_step13 {
    public static void main(String[] args) {
        double sum = 0.0;
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            try {
                sum += Double.parseDouble(reader.next());
            } catch (NumberFormatException e){}
        }
        System.out.format("%.6f", sum);
    }
}
