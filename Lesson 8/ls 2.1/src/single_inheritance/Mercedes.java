package single_inheritance;
public class Mercedes extends Car {
    String bonus;
    public Mercedes(String brand, String color, String engine, int door, String bonus) {
        super(brand, color, engine, door);
        this.bonus = bonus;
    }

    public String getInfo() {
        return "Brand: " + this.brand +
                "\nColor: " + this.color +
                "\nEngine: " + this.engine +
                "\nDoor: " + this.door +
                "\nBonus: " + this.bonus;
    }
}
