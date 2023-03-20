package ls4;

import java.util.Scanner;

public class iki_olc_arr_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Setir sayi: ");
        int setir = sc.nextInt();
        System.out.print("Sutun sayi: ");
        int sutun = sc.nextInt();
        int[][] arr = new int [setir][sutun];
        for (int i = 0;i<arr.length;i++){
            System.out.println((i+1) + "ci sira");
            for (int j = 0;j<arr[i].length;j++){
                System.out.print((j+1)+ "ci element: ");
                arr[i][j]=sc.nextInt();  
            }
        }
        int cem = 0;
        for (int i = 0;i<arr.length; i++){
            for (int j = 0;j<arr[i].length;j++){
                cem+=arr[i][j];
            }
        }
        System.out.println("Cem: " + cem);
    }  
}