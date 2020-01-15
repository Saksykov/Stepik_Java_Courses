/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал N вычисляется как 1 * 2 * ... * N.
 */

import java.math.BigInteger;

public class Operators_and_Loops_step8 {

    public static BigInteger factorial(int value) {
        BigInteger bi = BigInteger.valueOf(1);
        for(int i = 1; i < value+1; i++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        return bi;
    }
}
