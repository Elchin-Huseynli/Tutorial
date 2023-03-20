package ls4;

import java.util.Scanner;

public class username_password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- | Sign In System | -----");
        System.out.print("\nUsername daxil edin: ");
        String username1 = sc.nextLine();
        System.out.print("Password daxil edin: ");
        String password1 = sc.nextLine();
        System.out.println("\nUsernameniz: " + username1 + "\nPasswordunuz: " + password1);
        System.out.println("\n----- | Log In System | -----");
        System.out.print("\nUsername: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        if (!username.equals(username1) && password.equals(password1)){
            System.out.println("Username yanlisdir");
        }
        else if(!password.equals(password1) && username.equals(username1)){
            System.out.println("Password yanlisdir");
            
            for (int i = 0;i<2;i++){
                System.out.println((i+2) + "ci defe yeniden yazin: ");
                password = sc.nextLine();
                if (password.equals(password1)){
                    System.out.println("Dogrudur ve xos geldiniz");
                    break;
                }
            }
        }
        else if(!username.equals(username1) && !password.equals(password1)){
            System.out.println("Username ve password yanlisdir");
        }
        else{
            System.out.println("Xos geldiniz, " + username);
        }
    }
}
