package time;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Time time = new Time("22","54","49","38");
        Method[] methods = time.getClass().getDeclaredMethods();

        for (Method method : methods) {
            TimeManage timeManage = method.getDeclaredAnnotation(TimeManage.class);

            if (timeManage != null) {
                System.out.println(timeManage.value() + method.invoke(time));
            }
        }
    }
}
