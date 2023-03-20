package month;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < Month.values().length; i++) {
            System.out.println(Month.values()[i]);
        }
        System.out.println("---------");
        System.out.println(Month.JANUARY.ordinal());
        System.out.println(Month.JANUARY.name());
    }
}