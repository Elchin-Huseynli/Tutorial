package type;

import java.util.ArrayList;
import java.util.List;

public class Type {
    public static void typeInfo() {
        List<Object> objects = new ArrayList<>();
        System.out.println("Paket name: type");
        System.out.println("Class type: User\n");
        objects.add(new CustomConstructor(CustomConstructor.constructors));
        objects.add(new CustomMethod(CustomMethod.methods));
        objects.add(new CustomField(CustomField.fields));

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
