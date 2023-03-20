package car;

public class Mercedes extends Car {

    String car_name;

    @Override
    public void get() {
        System.out.println("Car name: " + this.car_name);
        super.get();
    }

    public Mercedes(String brand, String color, double engine, String car_name) {
        super(brand, color, engine);
        this.car_name = car_name;
    }
}
