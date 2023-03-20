package car;

public class Car {
    String brand;
    String color;
    double engine;

    public Car(String brand, String color, double engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void get() {
        System.out.println("Brand: " + this.brand +
                "\nColor: " + this.color +
                "\nEngine: " + engine);
    }
}
