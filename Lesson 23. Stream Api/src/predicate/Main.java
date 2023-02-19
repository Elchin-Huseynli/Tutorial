package predicate;

public class Main {
    public static void main(String[] args) {
        CustomPredicate customPredicate = (y -> y>23);
        System.out.println(customPredicate.run(45));
    }
}