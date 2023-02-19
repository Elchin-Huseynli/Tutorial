package supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        CustomSupplier<Integer> customSupplier = () -> 45;
        System.out.println(customSupplier.get());
    }
}
