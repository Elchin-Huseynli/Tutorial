package ls3;

import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ədəd daxil edin: ");
    int a = sc.nextInt();
    int fact = 1;
    
    for (int i =1;i<=a;i++){
        fact*=i;
    }
        System.out.println(fact);
    }
}