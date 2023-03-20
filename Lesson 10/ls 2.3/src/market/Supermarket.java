package market;

public class Supermarket extends  Service {
    private double price;
    private int number;

    public Supermarket(double price, int number) {
        this.price = price;
        this.number = number;
    }
    @Override
    public String totalPrice() {
        return "Total price: " + price*number;
    }
}