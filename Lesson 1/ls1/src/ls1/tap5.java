package ls1;
import java.util.Scanner;
public class tap5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci ədədi girin: ");
        int a = input.nextInt();
        System.out.println("Ikinci ədədi girin: ");
        int b = input.nextInt();
        System.out.println("Hasil: "+ (a*b));
    }
}
