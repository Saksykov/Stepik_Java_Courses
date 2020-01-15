/*
Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность – 0.0001 (1E-4)
 */

public class Primitive_types_step12 {

    public static boolean doubleExpression(double a, double b, double c) {
        if((a+b)>=c) return ((a + b) - c) <= 0.0001;
        else return (c - (a + b)) <= 0.0001;
    }
}
