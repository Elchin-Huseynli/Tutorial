package type;

import java.lang.reflect.Method;

public class CustomMethod {
    static Method[] methods = User.class.getDeclaredMethods();

    public CustomMethod(Method[] methods) {
        this.methods = methods;
    }

    @Override
    public String toString() {
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName() +
                    "\nReturn type: " + method.getReturnType() +
                    "\nParameters: " + method.getParameterCount() +
                    "\nAnnotations: " + method.getAnnotation(TypeManage.class) +
                    "\n-----------------------------------------"
                    );
        }
        return "";
    }
}
