package multipleCatch;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            arr[11] = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
