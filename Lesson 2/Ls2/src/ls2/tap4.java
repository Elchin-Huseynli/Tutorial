package ls2;

import java.util.Scanner;

public class tap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi girin: ");
        int a = sc.nextInt();
        int a1 = a/10;
        int a2 = a%10;
        System.out.println("Sum: " + (a1+a2));
    }
}
