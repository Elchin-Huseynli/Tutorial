package ls5;

public class str_bosluq {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7,8,9";
        String newstr = "";
        String[] strArr = str.split(",");
        for (int i = 0;i<strArr.length;i++){
            newstr+=strArr[i] + ", ";
        }
        System.out.println(newstr);
    }
}