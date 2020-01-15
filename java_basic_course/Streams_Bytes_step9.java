/*
Напишите программу, которая будет преобразовывать переводы строк из формата Windows в формат Unix.
Данные в формате Windows подаются программе в System.in, преобразованные данные должны выводиться в System.out.
На этот раз вам надо написать программу полностью, т.е. объявить класс
(с именем Main — таково ограничение проверяющей системы), метод main, прописать все import'ы.
 */
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Streams_Bytes_step9 {
    public static void main(String[] args) throws IOException {
        ArrayList<Byte> inputBytes = new ArrayList<Byte>();
        int is;
        InputStream inS = System.in;
        OutputStream outS = new BufferedOutputStream(System.out);
        while ((is = inS.read()) != -1) {
            inputBytes.add((byte) is);
        }
        for (int i = 0; i < inputBytes.size(); i++) {
            if (inputBytes.get(i) == 13) {
                if (i != inputBytes.size() - 1 && inputBytes.get(i + 1) == 10) {
                    continue;
                } else outS.write(inputBytes.get(i));
            } else {
                outS.write(inputBytes.get(i));
            }
        }
        outS.flush();
        outS.close();
    }
}
