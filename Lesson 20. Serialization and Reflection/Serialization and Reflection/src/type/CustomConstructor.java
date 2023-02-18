package type;

import java.lang.reflect.Constructor;


public class CustomConstructor {
    static Constructor[] constructors = User.class.getDeclaredConstructors();

    public CustomConstructor(Constructor[] constructors) {
        this.constructors = constructors;
    }

    @Override
    public String toString() {
        String str = "";
        for (Constructor constructor : constructors) {
            System.out.println("Constructor name: " + constructor.getName() +
                    "\nParameters: " + constructor.getParameterCount() +
                    "\nAnnotations: " + constructor.getAnnotation(TypeManage.class) +
                    "\n-----------------------------------------"
            );
        }
        return "";
    }
}
