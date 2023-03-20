package ls2;
        
import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Rəqəm: ");
    int gun = sc.nextInt();
    switch (gun) {
        case 1 :
            System.out.println("Bazar ertəsi");
            break;
        case 2 :
            System.out.println("Çərşənbə axşamı");
            break;
        case 3 :
            System.out.println("Çərşənbə");
            break;
        case 4 :
            System.out.println("Cümə axşamı");
            break;
        case 5 :
            System.out.println("Cümə");
            break;
        case 6 :
            System.out.println("Şənbə");
            break;
        case 7 :
            System.out.println("Bazar");
            break;
        default:
            System.out.println("1-7 arası rəqəm daxil edin"); 
        }
    }
}
