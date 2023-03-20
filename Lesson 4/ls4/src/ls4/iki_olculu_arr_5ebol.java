package ls4;

public class iki_olculu_arr_5ebol {
    public static void main(String args[]){  
        int[][] arr = { {25,1,5,10},{2,9,15} };
        for (int i = 0;i<arr.length; i++){
            for (int j = 0;j<arr[i].length;j++){
                if (arr[i][j]%5==0){
                    System.out.println(arr[i][j]);
                }
            }
        }  
    }  
}