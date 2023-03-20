package ls3;

public class tap7 {

    public static void main(String[] args){
       int[] sum = {5,-1,2,7,-8};
       int i = 0;
       int max = sum[0];
       int min = sum[0];
       while (i<sum.length){
       if (sum[i]>max){
       max = sum[i];}
       else if (sum[i]<min){
       min = sum[i];}
       i++;}
       System.out.println("Max: " + max);
       System.out.println("Min: " + min);
}
}