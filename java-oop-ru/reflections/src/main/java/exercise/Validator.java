package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN

public class Validator {
    public static List<String> validate(Object obj) {
        List<String> notValidFields = new ArrayList<>();

        // Получаем все поля объекта
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            // Проверяем, есть ли аннотация @NotNull для данного поля
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    // Получаем значение поля
                    Object value = field.get(obj);
                    // Если значение поля равно null, добавляем имя поля в список невалидных полей
                    if (value == null) {
                        notValidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return notValidFields;
    }
}
// END
