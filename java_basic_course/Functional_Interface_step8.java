/*
Давайте научимся комбинировать функции в более сложные функции. Для примера построим следующую комбинацию.
Дан предикат condition и две функции ifTrue и ifFalse. Напишите метод ternaryOperator,
который из них построит новую функцию, возвращающую значение функции ifTrue,
если предикат выполнен, и значение ifFalse иначе.
 */

import java.util.function.Function;
import java.util.function.Predicate;

public class Functional_Interface_step8 {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        Function<T, U> myFunct = new Function<T, U>() {
            @Override
            public U apply(T t) {
                return  condition.test(t) ?  ifTrue.apply(t): ifFalse.apply(t);
            }
        };

        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
}
