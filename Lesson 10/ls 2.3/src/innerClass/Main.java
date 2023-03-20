package innerClass;

public class Main {
    public static void main(String[] args) {
        User.Info info = new User().new Info();
        info.user_info = "Id is 19";
        info.age = 18;
        System.out.println("UserInfo: " + info.user_info + "\nAge: " + info.age);
    }
}
