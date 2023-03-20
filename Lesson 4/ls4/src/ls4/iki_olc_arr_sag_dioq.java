package ls4;

public class iki_olc_arr_sag_dioq {
    public static void main(String args[]){  
        int[][] arr = { {6,1,5},{2,9,1},{1,2,3} };
        for (int i = 0;i<arr.length; i++){
            for (int j = 0;j<arr[i].length;j++){
                if(i+j==arr.length-1){
                    System.out.println(arr[i][j]);
                }
            }  
        }  
    }
}