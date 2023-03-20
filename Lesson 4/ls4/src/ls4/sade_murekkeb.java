package ls4;

import java.util.Scanner;
        
public class sade_murekkeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eded daxil edin: ");
        int eded = sc.nextInt();
        int say = 0;
        
        if (eded<=0){
            System.out.println("0 dan boyuk eded daxil edin");
        }
        else{
            if (eded==1){
                System.out.println("Ne sade ne murekkeb");
            }
            else{
                for (int i = 1;i<=eded;i++){
                    if (eded%i==0){
                        say++;
                    }
                }
                if (say>2){
                    System.out.println("Murekkeb");
                }
                else{
                    System.out.println("Sade");
                }
            }
        }
    }
}
