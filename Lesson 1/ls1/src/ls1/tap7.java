package ls1;
import java.util.Scanner;
public class tap7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd girin:");
        int a = input.nextInt();
        int h = 1;
        for (int i = 1;i<=10;i++){
            h=i*a;
            System.out.println(a + "*" + i + "=" + h);
        }
    }
}
