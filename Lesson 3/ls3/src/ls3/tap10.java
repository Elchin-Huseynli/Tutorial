package ls3;

public class tap10 {
    public static void main(String[] args) {
        String[] str = {"salam","yui","aqe","yui"};
 
        for (int i = 0; i < str.length; i++){
            for (int j = i+1; j < str.length; j++){
                if (str[i] == str[j]){
                   System.out.println("Duplicate Element : "+ str[j]); 
                }
            }
        }
    }    
}