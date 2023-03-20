package ls5;

import java.util.Scanner;

public class caculator_app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = scanner.nextInt();
        System.out.print("num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Operation (+; -; *; /): ");
        String operation = scanner.next();
        switch (operation){
            case "+":
                System.out.println(num1 + "+" + num2 + "=" +  (num1+num2));
                break;
            case "-":
                System.out.println(num1 + "-" + num2 + "=" +  (num1-num2));
                break;
            case "*":
                System.out.println(num1 + "*" + num2 + "=" +  (num1*num2));
                break;
            case "/":
                if (num2==0){
                    System.out.println("0-a bolme yoxdur");
                }
                else{
                    System.out.println(num1 + "/" + num2 + "=" +  (num1/num2));
                }
                break;
            default:
                System.out.println("Duzgun operation daxil edin");
        }
    }
}
