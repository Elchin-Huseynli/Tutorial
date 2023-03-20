package user;
public class User {
    private String password;


    public void setPassword(String password) {
        this.password = password;
    }

    public boolean changePassword(String oldPassword,String newPassword) {
        if (oldPassword.equals(password)) {
            this.password = newPassword;
            System.out.println("Password changed successfully");
            return true;
        }
        else {
            System.err.println("The old password is incorrect");
            return false;
        }

    }

    public void checkPassword(String password) {
        if (password.equals(this.password)) {
            System.out.println("The password is correct");
        }
        else {
            System.err.println("The password is incorrect");
        }
    }
}
