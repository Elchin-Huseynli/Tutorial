package ls1;
import java.util.Scanner;
public class tap13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1ci ədədi daxil edin: ");
        int a = input.nextInt();
        System.out.println("2ci ədədi daxil edin: ");
        int b = input.nextInt();
        System.out.println("Cəmi: " + (a+b));
        System.out.println("Fərqi: " + (a-b));
        System.out.println("Hasili: " + (a*b));
        System.out.println("Ədədi ortası: " + (double) ((a+b)/2));
        System.out.println("Modulu: " + Math.abs(a-b));
        System.out.println("Max: " + Math.max(a,b));
        System.out.println("Max: " + Math.min(a,b));
    }
}