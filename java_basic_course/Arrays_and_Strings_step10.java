package java_basic_course;/*
Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка,
которая читается одинаково слева направо и справа налево (в том числе пустая).
При определении "палиндромности" строки должны учитываться только буквы и цифры.
А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латин-е буквы, знаки препин-я).
Т.е. русских, китайских и прочих экзотических символов в строке не будет.
 */

public class Arrays_and_Strings_step10 {

    public static boolean isPalindrome(String text) {
        String pol = text.replaceAll("[^A-Za-z0-9]+", "");
        StringBuilder sb = new StringBuilder(pol.subSequence(0, pol.length()));
        sb = sb.reverse();
        text = sb.toString();
        return pol.equalsIgnoreCase(text);
    }
}
