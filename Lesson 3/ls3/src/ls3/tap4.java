package ls3;

public class tap4 {

    public static void main(String[] args) {
        int[] sum = {2,4,6,8};
        int cem = 0;
        for (int i = 0;i<sum.length;i++){
        cem+=sum[i];
        }
        int m = sum.length;
        System.out.println("Ədədi orta: " + (cem/m));
    }
    
}
