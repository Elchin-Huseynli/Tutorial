package ls1;
import java.util.Scanner;
public class tap12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int a = input.nextInt();
        System.out.println("Kvadratı: " + (int) Math.pow(a,2));
        System.out.println("Kubu: " + (int) Math.pow(a,3));
        System.out.println("Dördüncü dərəcədən: " + (int) Math.pow(a,4));
    }
}