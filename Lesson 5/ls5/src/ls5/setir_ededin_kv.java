package ls5;

public class setir_ededin_kv {
    public static void main(String[] args) {
        String t = "             1,e 6,e 0,e 9,e           ";
        String d = t.trim() + " ";
        String[] strArr = d.split(",e ");
        for (int i = 0;i<strArr.length;i++){
            Integer number = Integer.parseInt(strArr[i]);
            System.out.println( "Orginal: " + strArr[i] + "  Power: " +  (int) Math.pow(number,2));
        }
    }
}
