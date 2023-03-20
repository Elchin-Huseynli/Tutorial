package ls1;
import java.util.Scanner;
public class tap6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci ədədi girin: ");
        int a = input.nextInt();
        System.out.println("Ikinci ədədi girin: ");
        int b = input.nextInt();
        System.out.println("Cəm: "+ (a+b));
        System.out.println("Fərq: "+ (a-b));
        System.out.println("Hasil: "+ (a*b));
        System.out.println("Nisbət: "+ (a/b));
    }
}
