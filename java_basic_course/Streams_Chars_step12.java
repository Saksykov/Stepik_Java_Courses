/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 */

import java.io.*;
import java.nio.charset.Charset;

public class Streams_Chars_step12 {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        int ch;
        StringBuilder str= new StringBuilder();
        while ((ch = reader.read())!=-1){
            str.append((char)ch);
        }
        return str.toString();
    }
}
