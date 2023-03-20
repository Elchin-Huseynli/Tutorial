package ls4;

import java.util.Scanner;

public class reqemlerinin_cemi {
    public static void main(String args[]){  
        int eded, reqem, cem = 0;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number: ");  
        eded = sc.nextInt();  
        while(eded > 0){  
            reqem = eded % 10;  //674%10=4   67%10=7      6%10=6
            cem = cem + reqem;  //cem=4      cem=4+7=11   cem=11+6=17
            eded = eded / 10;   //674/10=67  67/10=6
        }  
        System.out.println("Sum of Digits: " + cem);  
    }  
}
