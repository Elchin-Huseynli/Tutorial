package ls1;
import java.util.Scanner;
public class tap11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int a = input.nextInt();
        int il = a/525600;
        int gun = (a%525600)/1440;
        System.out.println(a + " dəqiqə " + il + " il və " +  gun + " gündür ");
    }
}