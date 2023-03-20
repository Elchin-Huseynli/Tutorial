package car;

public class Car extends CarAbstract{
    @Override
    String color() {
        return "Color: black";
    }

    @Override
    String brand() {
        return "Marka: mrecedes";
    }

    @Override
    String engine() {
        return "Engine: 2.2";
    }
}
