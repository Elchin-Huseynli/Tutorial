package ls4;

import java.util.Scanner;

public class setir_ters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Setir: ");
        String setir = sc.nextLine();
        String newsetir = "";
        for (int i = 0;i<setir.length();i++){
             char ch = setir.charAt(i);
            newsetir = ch +  newsetir;
        }
        if (setir.equals(newsetir)){
            System.out.println("Beraberdir");
        }
        else{
            System.out.println("Beraber deyil");
        }
    }
}
