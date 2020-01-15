/*
Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
Данная задача актуальна, например, при работе с битовыми полями.

Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 */

public class Primitive_types_step15 {
    public static int flipBit(int value, int bitIndex) {
        return value^1<<(bitIndex - 1); // put your implementation here
    }
}
