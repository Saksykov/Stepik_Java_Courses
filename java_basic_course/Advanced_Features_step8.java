/*
Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal.
Массив байт устроен следующим образом. Сначала идет число типа int, записанное при помощи
ObjectOutputStream.writeInt(size). Далее подряд записано указанное количество объектов типа Animal,
сериализованных при помощи ObjectOutputStream.writeObject(animal).
 */

import java.io.*;
import java.util.Objects;

public class Advanced_Features_step8 {
    public static Animal[] deserializeAnimalArray(byte[] data) throws IllegalArgumentException {
        Animal[] animals = null;
        int j;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new ByteArrayInputStream(data));
            j = ois.readInt();
            animals = new Animal[j];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) ois.readObject();
            }
            ois.close();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }
}
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}