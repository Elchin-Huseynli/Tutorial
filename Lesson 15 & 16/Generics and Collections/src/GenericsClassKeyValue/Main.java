package GenericsClassKeyValue;

public class Main {
    public static void main(String[] args) {
        Generics generics = new Generics<>(1,"one");
        Generics generics2 = new Generics<>(2,"two");
        Generics generics3 = new Generics<>(3,"three");
        generics.get();
        generics2.get();
        generics3.get();
    }
}
