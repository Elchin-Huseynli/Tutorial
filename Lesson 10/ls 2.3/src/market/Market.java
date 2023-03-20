package market;
public class Market extends Service {
    private double price;
    private int number;

    public Market(double price, int number) {
        this.price = price;
        this.number = number;
    }
    @Override
    public String totalPrice() {
        return "Total price: " + price*number;
    }
}