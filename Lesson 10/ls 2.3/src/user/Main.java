package user;

import user.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.register();
        user.show();
    }
}
