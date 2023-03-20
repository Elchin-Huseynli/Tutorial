package ls4;

import java.util.Scanner;

public class rekursiya_fact {

    static int factorial(int eded) {
        if (eded <= 1) {
            return 1;
        } else {
            return eded * factorial(eded - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));     
    }
}
