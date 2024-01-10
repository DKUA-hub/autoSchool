package module5;

import java.lang.reflect.Field;
import java.util.Random;

import static java.util.stream.IntStream.range;

public class Program {
    public static void main(String[] args) {

        Parent first = new ChildOne();
        Parent second = new ChildTwo();

        setFieldsValues(first);
        first.printChildFields();

        setFieldsValues(second);
        second.printChildFields();
    }

    private static void setFieldsValues(Object obj) {
        Class<?> objClass = obj.getClass();
        Random random = new Random();
        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getName().matches("age")) {
                try {
                    field.set(obj, random.nextInt(83) + 18);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            if (field.getName().matches("name")) {
                try {
                    field.set(obj, "Noname");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}