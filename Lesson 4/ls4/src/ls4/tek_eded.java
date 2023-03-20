package ls4;

import java.util.Scanner;

public class tek_eded {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded: ");
        int eded = sc.nextInt();
        for (int i = 0;i<eded;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
    
}
