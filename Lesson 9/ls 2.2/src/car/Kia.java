package car;

public class Kia extends Car {
    String car_name;

    public Kia(String brand, String color, double engine, String car_name) {
        super(brand, color, engine);
        this.car_name = car_name;
    }

    @Override
    public void get() {
        System.out.println("Car name: " + this.car_name);
        super.get();
    }
}
