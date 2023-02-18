package type;

import java.lang.reflect.Field;


public class CustomField {
    static Field[] fields = User.class.getDeclaredFields();

    public CustomField(Field[] fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName() +
                    "\nField type: " + field.getType() +
                    "\nAnnotations: " + field.getAnnotation(TypeManage.class) +
                    "\n-----------------------------------------"
            );
        }
        return "";
    }
}
