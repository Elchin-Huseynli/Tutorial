package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        User user = new User();

        Method[] methods = user.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println("Parameter count: " + method.getParameterCount());
            System.out.println("Class: " + method.getDeclaringClass());
            System.out.println("------------------------");
        }

        Field[] fields = user.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Class: " + field.getDeclaringClass());
            System.out.println("--------------------------");
        }

        Constructor[] constructors = user.getClass().getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor name: " + constructor.getName());
            System.out.println("Parameter count: " + constructor.getParameterCount());
            System.out.println("Class: " + constructor.getDeclaringClass());
            System.out.println("----------------------------");
        }
    }
}