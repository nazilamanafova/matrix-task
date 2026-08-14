package annotations;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            try {
                Object value = field.get(object);
                if (field.isAnnotationPresent(NotNull.class)) {

                    if (value == null || value.toString().trim().isEmpty()) {

                        throw new ValidationException(fields.getClass() + " cannot be null");
                    }
                }
                if (field.isAnnotationPresent(Email.class)) {
                    String email = (String) value;
                    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

                    if (email == null || !email.matches(regex)) {

                        throw new ValidationException("Invalid email: " + email);
                    }
                }
                if (field.isAnnotationPresent(Min.class)) {

                    int min = field.getAnnotation(Min.class).value();

                    int number = (Integer) value;

                    if (number < min) {
                        throw new ValidationException(
                                field.getName()
                                        + " must be at least "
                                        + min);
                    }
                }
                if (field.isAnnotationPresent(Max.class)) {

                    int max = field.getAnnotation(Max.class).value();
                    int number = (Integer) value;

                    if (number > max) {

                        throw new ValidationException(field.getName()
                                + " must be at most " + max);
                    }
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }


        }
    }
}