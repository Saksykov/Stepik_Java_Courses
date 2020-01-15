package java_basic_course;/*
Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
Во всех остальных случаях метод должен возвращать false.
 */

public class Primitive_types_step6 {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] bul = {a,b,c,d};
        int count = 0;
        for(boolean e: bul){
            if (e) count++;
        }
        if (count == 2) return  true;
        else return false;
    }
}

