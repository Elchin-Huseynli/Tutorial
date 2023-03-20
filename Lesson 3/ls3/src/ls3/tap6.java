package ls3;

public class tap6 {

    public static void main(String[] args){
        int[] sum = {1,4,6,5,3,2};
        int element = 5;
        int index = -1;
        
        int  i = 0;
        while (i < sum.length){
            if (sum[i]==element){
                index = i;
                break;
            }
            i++;
        }
        System.out.println("Index of "+element+" is : "+index);
    }
}