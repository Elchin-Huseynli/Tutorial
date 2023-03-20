package ls2;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Yaşınızı girin: ");
      int yas = sc.nextInt();
      String g = yas>=18 ? "Girə bilərsiniz" : "Giriş qadağandır";
      System.out.println(g);
    }    
}
