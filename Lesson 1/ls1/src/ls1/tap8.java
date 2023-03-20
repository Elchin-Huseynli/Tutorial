package ls1;
import java.util.Scanner;
public class tap8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Faranheyt daxil edin:");
        int f = input.nextInt();
        float c = (f-32)*5/9;
        System.out.println(f + " dərəcə faranheyt " + c + " dərəcə selsidir ");
    }
}