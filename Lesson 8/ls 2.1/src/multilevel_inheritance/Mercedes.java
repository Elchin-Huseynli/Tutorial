package multilevel_inheritance;
public class Mercedes extends Car {
    String car_name;
    String car_logo;

    public Mercedes(String color, String engine, int price, String car_name, String car_logo) {
        super(color, engine, price);
        this.car_name = car_name;
        this.car_logo = car_logo;
    }
}
