package stackTrace;

public class StackTrace {
    public static void main(String[] args) {
        try {
            Integer.parseInt("salam");
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("------------");
            System.out.println(e);
            System.out.println("------------");
            e.printStackTrace();
        }
    }
}
