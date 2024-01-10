package module5;

import java.lang.reflect.Field;

public class Parent {
    public void printChildFields(){
        //Reflection
        Class<?> childClass = this.getClass();
        Field[] fields = childClass.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.printf("Field: %s, Value: %s.%n",
                        field.getName(),
                        field.get(this)
                );
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
