package ls2;

import java.util.Scanner;

public class sc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Birinci ədədi girin: ");
            int a = sc.nextInt();
            System.out.println("Ikinci ədədi girin: ");
            int b = sc.nextInt();
            System.out.println("Əməliyyat seçin: ");
            System.out.println("1-toplama; 2-çıxma; 3-vurma; 4-bölmə");
            System.out.println("Seçiminiz: ");
            int secim = sc.nextInt();
            if(secim == 1) {
                System.out.println(a + "+" + b + "=" + (a+b));
            }
            else if(secim == 2) {
                System.out.println(a + "-" + b + "=" + (a-b));
            }
            else if(secim == 3) {
                System.out.println(a + "*" + b + "=" + (a*b));
            }
            else if(secim == 4) {
                if(b == 0) {
                    System.out.println("0-a bölmə yoxdur");
                }
                else{
                    System.out.println(a + "/" + b + "=" + (a/b));
                }
            }
        }
    }
}
