package single_inheritance;
public class Car{
     String brand;
     String color;
     String engine;
     int door;

    public Car(String brand, String color, String engine, int door) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.door = door;
    }

    /*public String getInfo() {
        return "Brand: " + this.brand +
                "\nColor: " + this.color +
                "\nEngine: " + this.engine +
                "\nDoor: " + this.door;
    }*/
}
