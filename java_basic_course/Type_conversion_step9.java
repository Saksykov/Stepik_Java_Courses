package java_basic_course;/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 */

public class Type_conversion_step9 {

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        if(value != 0) return (value & (value - 1)) == 0;
        else return false;
    }
}
