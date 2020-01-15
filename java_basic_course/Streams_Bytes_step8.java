/*
Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.

Контрольная сумма данных вычисляется по следующему алгоритму:

Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле:
C_{n+1} = rotateLeft(C_n) xor  b_{n+1} , где C_n — контрольная суммапервых n байт данных,
rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед,
используйте Integer.rotateLeft), b_n — n-ный байт данных.
 */

import java.io.IOException;
import java.io.InputStream;

public class Streams_Bytes_step8 {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int check = 0, b;
        while ((b = inputStream.read()) != -1) {
            check = Integer.rotateLeft(check, 1) ^ b;
        }
        return check;
    }
}
