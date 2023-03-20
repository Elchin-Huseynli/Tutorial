package multilevel_inheritance;

public class Yesqa extends Mercedes {
    String type;
    String bonus;

    public Yesqa(String color, String engine, int price, String car_name, String car_logo, String type, String bonus) {
        super(color, engine, price, car_name, car_logo);
        this.type = type;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Yesqa{" +
                "type='" + type + '\'' +
                ", bonus='" + bonus + '\'' +
                ", car_name='" + car_name + '\'' +
                ", car_logo='" + car_logo + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }
}
