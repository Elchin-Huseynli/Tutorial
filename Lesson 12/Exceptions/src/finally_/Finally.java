package finally_;

public class Finally {
    public static void main(String[] args) {
        try {
            Integer.parseInt("salam");
        }
        catch (NumberFormatException e) {
            System.err.println("String type cannot be passed to int");
        }
        finally {
            System.out.println("Good bye");
        }
    }
}
