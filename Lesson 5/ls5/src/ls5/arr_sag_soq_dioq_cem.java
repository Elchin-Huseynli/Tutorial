package ls5;

public class arr_sag_soq_dioq_cem {
    public static void main(String[] args) {
        int cem = 0;
        int[][] intArr = {{1,4,7},{2,3,8},{9,3,6}};
        for (int i = 0;i<intArr.length;i++){
            for (int j = 0;j<intArr[i].length;j++){
                if (i==j){
                    System.out.println("Baş: " + intArr[i][j]);
                    cem+=intArr[i][j];
                }
            }
        }
        System.out.println("\n");
        for (int i = 0;i<intArr.length;i++){
            for (int j = 0;j<intArr[i].length;j++){
                if (i+j==intArr.length-1){
                    System.out.println("Sag: " + intArr[i][j]);
                    cem+=intArr[i][j];
                }
            }
        }
        System.out.println("\nCem: " + cem);
    }
}