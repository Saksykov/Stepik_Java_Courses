/*
Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале
по формуле левых прямоугольников.

Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. Его метод applyAsDouble()
принимает значение аргумента и возвращает значение функции в заданной точке.

Интервал интегрирования задается его конечными точками a и b, причем a <= b. Для получения достаточно точного
результата используйте шаг сетки не больше 10^-6 .
 */

import java.util.function.DoubleUnaryOperator;

public class Abstract_Class_step7 {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = 0.00001, pl = 0.0;
        for(double d = a; d < b; d += step){
            pl += f.applyAsDouble(d) * step;
        }
        return pl;
    }
}
