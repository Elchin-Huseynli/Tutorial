package GenericsMethod;

public class Generics {
    public static void main(String[] args) {
        System.out.println(isEqual("abc","abc"));
    }

    public static <T> boolean isEqual(T a, T b) {
            boolean isEqual = a.equals(b);
            return isEqual;
    }

}
