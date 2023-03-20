package translationApp.util;
import static translationApp.util.InputUtil.inputTypeByte;
public class MenuUtil {
    public static byte entry() {
        System.out.println(
                "\n[1] Azerbaijan to English" +
                "\n[2] English to Azerbaijan" +
                "\n[3] Exit \n"
        );
        return inputTypeByte("Option: ");
    }
}
