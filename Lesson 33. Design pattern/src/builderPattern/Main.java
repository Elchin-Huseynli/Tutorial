package builderPattern;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new  Restaurant.Builder("potato")
                .withSpice(true)
                .drink("cola")
                .sweet("ice-cream")
                .builder();

        System.out.println(restaurant);
    }
}
