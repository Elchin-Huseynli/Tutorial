package ls2;

import java.util.Scanner;

public class tap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi girin: ");
        int a = sc.nextInt();
        System.out.println("Ikinci ədədi girin: ");
        int b = sc.nextInt();
        System.out.println("Üçüncü ədədi girin: ");
        int c = sc.nextInt();
        System.out.println("Ədədi orta: " + (a+b+c)/3);
    }
    
    
}
