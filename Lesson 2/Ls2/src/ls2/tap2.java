package ls2;

import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi girin: ");
        int a = sc.nextInt();
        System.out.println("Ikinci ədədi girin: ");
        int b = sc.nextInt();
        System.out.println("Üçüncü ədədi girin: ");
        int c = sc.nextInt();
        /*int d = Math.min(a,b);
        System.out.println("Min: " + Math.min(c,d));*/
        if (a<b && a<c){
            System.out.println("Min: " + a);
        
        } else if(b<a && b<c){
            System.out.println("Min: " + b);
            
        } else{
            System.out.println("Min: " + c);
        }
    }
}
