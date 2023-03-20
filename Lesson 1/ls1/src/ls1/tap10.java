package ls1;
import java.util.Scanner;
public class tap10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int a = input.nextInt();
        int a1 = a%10;
        int a2 = a/10%10;
        int a3 = a/100;
        System.out.println("Cəm: " + (a1+a2+a3));
    }
}