package user;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setPassword("1234");

        user.changePassword("1234","12345");
        user.checkPassword("12345");

    }
}
