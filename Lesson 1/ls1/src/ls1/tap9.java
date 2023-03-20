package ls1;
import java.util.Scanner;
public class tap9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int a = input.nextInt();
        float b = 0.0254f;
        float c = a*b;
        System.out.println(a + " inch is " + c + " metrs");
    }
}