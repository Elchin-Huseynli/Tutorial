package ls4;

public class for_3_proq {
    
    static void a(){
        for (int i = 0;i<5;i++){
            System.out.println("**********");
        }
    }
    
    static void b(){
        for (int i=0;i<5;i++){
            for (int j = 0;j<5;j++){
                if(i>=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //a();
        b();
        //c();
    }
}
