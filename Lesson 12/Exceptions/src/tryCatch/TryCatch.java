package tryCatch;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Integer.parseInt("salam");
        }
        catch (NumberFormatException e) {
            System.err.println("String type cannot be passed to int");
        }
    }
}