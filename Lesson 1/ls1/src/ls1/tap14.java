package ls1;
import java.util.Scanner;
public class tap14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int a = input.nextInt();
        int a1 = a/100000;
        int a2 = a/10000%10;
        int a3 = a/1000%10;
        int a4 = a/100%10;
        int a5 = a/10%10;
        int a6 = a%10;
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6);
    }
}