package ls4;

import java.util.Scanner;

public class sait_samit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cumle: ");
        String cumle = sc.nextLine();
        int sait_sayi = 0;
        int samit_sayi = 0;
        cumle = cumle.toLowerCase();
        for (int i = 0;i<cumle.length();i++){
            if (cumle.charAt(i) == 'a' || cumle.charAt(i) == 'e' || cumle.charAt(i) == 'i' || cumle.charAt(i) == 'o' || cumle.charAt(i) == 'u'
            || cumle.charAt(i) == 'ə' || cumle.charAt(i) == 'ö'|| cumle.charAt(i) == 'ü'|| cumle.charAt(i) == 'ı'){
                sait_sayi++;
            }
            else if (cumle.charAt(i)>='a' && cumle.charAt(i)<='z'){
                samit_sayi++;
            }
        }
        System.out.println("Sait sayi: " + sait_sayi);
        System.out.println("Samit sayi: " + samit_sayi);
    }
 
}

