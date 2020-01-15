/*
Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов
(их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char,
AsciiCharSequence будет занимать в два раза меньше памяти.

Класс AsciiCharSequence должен:
реализовывать интерфейс java.lang.CharSequence;
иметь конструктор, принимающий массив байт;
определять методы length(), charAt(), subSequence() и toString().
 */

public class Abstract_Class_step8 implements CharSequence{ // rename class AsciiCharSequence
    byte[] bytes;
    public Abstract_Class_step8(byte[] bytes){
        this.bytes = bytes;
    }
    @Override
    public String toString() {
        return new String(bytes, java.nio.charset.StandardCharsets.ISO_8859_1);
    }
    @Override
    public int length(){
        return bytes.length;
    }
    @Override
    public char charAt(int index){
        char t000 = (char)bytes[index];
        return t000;
    }
    @Override
    public CharSequence subSequence(int start, int end){
        int length = end - start;
        byte[] byt = new byte[length];
        for (int i = 0, j = start; i < length; i++, j++) {
            byt[i] = bytes[j];
        }
        return new Abstract_Class_step8(byt);
    }
}
